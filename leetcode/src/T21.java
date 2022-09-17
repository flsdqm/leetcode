public class T21 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
/*链表设置虚拟头结点dummyhead，这样对链表来说，第一个元素就是dummyhead的next所对应的节点元素，而不是dummyhead所对应的节点元素。
dummyhead位置所对应的元素是根本不存在的，这只是未来我们编写逻辑方便而出现的一个虚拟头结点。
dummyhead就是索引为0的这个位置的元素的前一个节点。当我们有了dummyhead后，为链表添加一个元素，就不需要对头结点进行特殊处理了，只需要找到等待添加位置的前一个位置的节点.*/
        ListNode cur = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;//这里不需要数据填入，因为其实是链表在不断取list1和list2的接在后面
                cur = cur.next;//右移
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            cur.next = list2;
        } else{
            cur.next = list1;
        }
        return dummyHead.next;//不能return cur，因为cur最后指向中间或者末尾。
    }
}
