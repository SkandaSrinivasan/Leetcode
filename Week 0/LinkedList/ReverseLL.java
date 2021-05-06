
public class ReverseLL {
    public static void main(String[] args){
        MyLinkedList lst = new MyLinkedList();
        lst.addAtTail(23);
        lst.addAtHead(12);
        ListNode pointer = lst.head;
        ListNode prev = null;
        while(pointer!=null){
            ListNode temp = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = temp;
        }
    }
    

}
