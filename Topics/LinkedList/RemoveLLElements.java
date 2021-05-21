/*One of the easier ones. Chose not to do the sentinel node approach. worked out faster in the end.*/
public class RemoveLLElements{
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode pointer = head;
        while(pointer.next!=null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }
            else{pointer = pointer.next;}
            
        }
        return head.val == val ? head.next:head;
    }
}