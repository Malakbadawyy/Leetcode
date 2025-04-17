public class mergeTwoSortedLists {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1=null;
        ListNode cur2=null;
        ListNode prev1= null;
        ListNode reshead=null;
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        if(list1.val<=list2.val){
            reshead=list1;
            cur2=list2;
            
        }else{
            reshead=list2;
            cur2=list1;
        }
        cur1=reshead.next;
        prev1=reshead;
        while( cur1!=null  && cur2!=null ){
            if(cur1.val<=cur2.val){
                prev1.next=cur1;
                prev1=cur1;
                cur1=cur1.next;
            }else{
                prev1.next=cur2;
                prev1=cur2;
                cur2=cur2.next;
            }
        }
        if(cur1!=null && cur2==null){
        prev1.next=cur1;
        }
        if(cur1==null && cur2!=null){
        prev1.next=cur2;
        }

        return reshead;


    }



    public ListNode mergeTwoListsOpt(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // Dummy node to simplify edge cases
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, attach them
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next; // The actual merged head
    }


}
