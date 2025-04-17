import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reorderList {
     public void reorderList(ListNode head) {
        int size=0;
        ListNode curr= head;
        Stack<ListNode> s= new Stack<>();
        Queue<ListNode> queue = new ArrayDeque<>();
        
        
      
        if(curr==null) return ;
        while (curr!=null){
            size++;
            curr=curr.next;
        }
       int queueCount = (size + 1) / 2;
        curr=head;
        while(queueCount>0){
            queue.add(curr);
            curr=curr.next;
            queueCount--;
        }

       while (curr != null) {
            s.push(curr);
            curr=curr.next;
        }
        ListNode dummy = new ListNode(0);
        curr = dummy;

        while (!queue.isEmpty() || !s.isEmpty()) {
            if (!queue.isEmpty()) {
                curr.next = queue.remove();
                curr = curr.next;
            }
            if (!s.isEmpty()) {
                curr.next = s.pop();
                curr = curr.next;
            }
        }
        curr.next = null;

 
        
    }
}
