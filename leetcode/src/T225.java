import java.util.LinkedList;
import java.util.Queue;

public class T225 {
    class MyStack {
        private Queue<Integer> a;
        private Queue<Integer> b;

        public MyStack() {
            a = new LinkedList<>();
            b = new LinkedList<>();
        }

        public void push(int x) {
            a.offer(x); //a中尾部加入x
            while(!b.isEmpty()) //判断b不空，就把b的所有元素从头到尾放入a队列队尾，新push的永远在队首
                a.offer(b.poll());
            Queue temp = a; //再将a队列和b队列交换，a队列始终为空
            a = b;
            b = temp;
        }

        public int pop() {
            return b.poll();
        }

        public int top() {
            return b.peek();
        }

        public boolean empty() {
            return b.isEmpty();
        }
    }
}
