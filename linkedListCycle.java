import java.util.HashSet;

public class linkedListCycle {
    // This is the optimized approach to find if a linked list has a cycle or not.
    public boolean hasCycleOptimized(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
                return true;
        }
        return false;
    }

    // This is the brute force approach to find if a linked list has a cycle or not.
    // It uses a hashset to store the nodes of the linked list and checks if a node is already present in the hashset.
       public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hash= new HashSet<>();
        ListNode curr=null;
        if(head==null){
            return false;
        }
        while(head.next!=null){
            if(hash.contains(head)){
                return true;
            }
            else{
                curr= head;
                head=head.next;
                hash.add(curr);
            }
        }
        return false;
        
    }
}
