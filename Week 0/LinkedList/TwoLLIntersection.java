public class detectCycleII {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> mySet = new HashSet<>();
            if(headA == null || headB == null) return null;
            while(headA != null){
                mySet.add(headA);
                headA = headA.next;
            }
            while(headB !=null){
                if(mySet.contains(headB)){
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }

}
/* Best method without space. Another method is unintuitive.
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int m = 0;
    int n = 0;
    ListNode pointerA = headA;
    ListNode pointerB = headB;
    while(pointerA != null){
        m++;
        pointerA = pointerA.next;
    }
    while(pointerB != null){
        n++;
        pointerB = pointerB.next;
    }
    if(m > n){
        int diff = m-n;
        for(int i = 0 ;i < diff; i++){
            headA = headA.next;
        }
    }
        else{
            int diff = n-m;

        for(int i = 0 ;i < diff; i++){
            headB = headB.next;
        }
        }
    
    
    while(headA!=null && headB!=null){

        if(headA == headB) return headA;
        headA = headA.next;
        headB = headB.next;
    }
    return null;
} 
----The cleanest method
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
        // Note: In the case lists do not intersect, the pointers for A and B
        // will still line up in the 2nd iteration, just that here won't be
        // a common node down the list and both will reach their respective ends
        // at the same time. So pA will be NULL in that case.
    }

*/