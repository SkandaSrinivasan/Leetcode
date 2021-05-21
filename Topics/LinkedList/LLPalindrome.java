public class LLPalindrome{
/* Did this was a arraylist at first.But a stack ran faster.*/
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s = new Stack();
        ListNode temp = head;
        while(temp != null){
            s.push(temp);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(s.pop().val != temp.val){
                return false;
            }else{
                temp = temp.next;
            }
        }
        return true;
    }
}