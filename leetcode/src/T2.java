public class T2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        int t = 0;
        while(l1 != null || l2 != null || t != 0){
            if(l1 != null){
                t += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                t += l2.val;
                l2 = l2.next;
            }//t作为进位先加了l1的一位又加了l2的一位
            pre.next = new ListNode(t % 10);//直接边新建节点边把数放在位置上
            pre = pre.next;
            t /= 10;//t除以10是进位
        }
        return dummyHead.next;
    }

    //此题如果不用dummyHead的话会在赋值时不方便，无法边新建边赋值
}
