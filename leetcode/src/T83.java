public class T83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;//这只是递归出口，但真正函数返回是最后一行。
        if (head.val == head.next.val) {
            head = deleteDuplicates(head.next);//递归
        } else {
            head.next = deleteDuplicates(head.next);//如果不等，head就保留下来，让head的下一个结点继续进行递归，直到最后head下一个，下一个，为空。
        }
        return head;
    }
}
