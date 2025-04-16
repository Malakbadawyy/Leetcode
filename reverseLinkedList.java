import java.util.Stack;

public class reverseLinkedList {
    //Intuitive solution using stack 
     public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> s = new Stack<>();
        ListNode consc=null;
        while(head != null && head.next!= null  ){
            s.push(head);
            head=head.next;
        }
        if(!s.isEmpty())
        {
        consc= s.pop();
        head.next = consc;
        consc.next=null;
        }
        while(!s.isEmpty()){
            consc.next= s.pop();
            consc=consc.next;
            consc.next= null;
        }
        

        return head;
    }




//optimized solution using iterative approach
// Time complexity: O(n) where n is the number of nodes in the linked list.
    public ListNode reverseListOptimized(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
