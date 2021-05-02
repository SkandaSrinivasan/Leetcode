public class detectCycle{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    // Hashset version of finding a cycle
    public boolean hasCycle(ListNode head){ 
        Set<ListNode> mySet = new HashSet<>();
        while(head!=null){
            if(mySet.contains(head)) return true;
            mySet.add(head);
            head = head.next;
        }
        return false;
    }
}
/*if(head == null || head.next == null)
            return false;
        
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null)
        { 
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
        Two pointer cleaner version(preferred)*/