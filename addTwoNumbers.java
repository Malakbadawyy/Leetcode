
public class addTwoNumbers {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyNode = new ListNode();
        ListNode curr= dummyNode;
        while(l1 != null || l2 != null || carry != 0){
            if(l1 == null && l2 == null){
                curr.next = new ListNode(1);
                break;
            } else
            if(l1 == null){
                int addvalue= l2.val + carry;
                carry= addvalue/10;
                curr.next= new ListNode(addvalue%10);
                l2=l2.next;
                curr=curr.next;
            }else
            if(l2 == null){
                int addvalue= l1.val + carry;
                carry= addvalue/10;
                curr.next= new ListNode(addvalue%10);
                l1=l1.next;
                curr=curr.next;

            }
            else
            {
                int addvalue= l1.val + l2.val  + carry;
                carry= addvalue/10;
                curr.next= new ListNode(addvalue%10);
                l1=l1.next;
                l2=l2.next;
                curr=curr.next;

            }
        } 
        return dummyNode.next;
    }
}
class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
