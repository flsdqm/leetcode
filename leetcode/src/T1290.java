import java.util.ArrayList;

public class T1290 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue1(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int num = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            num += list.get(i)*Math.pow(2, list.size()-1-i);
        }
        return num;
    }

    public int getDecimalValue2(ListNode head) {
        String str = "";
        while(head != null){
            str += head.val;
            head = head.next;
        }
        return Integer.valueOf(str,2);
    }//本来想这样写，方法忘了

    //这个是真的妙，知道会有简单写法，就是想不到移位，移位的数还直接就是十进制
    public int getDecimalValue3(ListNode head){
        int result = 0;
        while(head != null){
            result <<= 1;
            result |= head.val;
            head = head.next;
        }
        return result;
    }
}
