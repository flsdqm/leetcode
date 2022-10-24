public class T876 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode1(ListNode head) {
        ListNode p = head;
        int length = 0;
        while(p != null){
            length++;
            p = p.next;
        }
        int n;
        n = length/2 + 1;
        p = head;
        for(int i = 1; i < n; i++){
            p = p.next;
        }
        return p;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            q = q.next.next;
            p = p.next;
        }
        return p;
    }
    //快慢指针太牛了，快指针走两步，慢指针一步，当快指针到终点时，慢指针到中间。
}
