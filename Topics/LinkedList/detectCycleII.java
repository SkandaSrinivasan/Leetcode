/* The floyd cycle detection algorithm for detecting a cycle and where it starts
i) find the intersection node with the standard fast/slow pointer method.
ii) Iterate from head with ptr1 and iterate from intersection node with ptr2. When they both meet, thats the node where the cycle
starts

Another method is to use the simple method of a hashset used in cycleI and just return the first node that is a dup in the set
 */

public class detectCycleII {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode intersect = getIntersect(head);
        if(intersect == null) return null;
        
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
    public ListNode getIntersect(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return slow;
        }
        return null;
            
    }
}
