import java.util.Stack;

public class RemovingStarsFromString {
    // First Solution that came to mind
        public String removeStars(String s) {
        Stack<Character> stk = new Stack<Character>();
        Character c;
        String res= "";
        for(int i=0;i<s.length();i++){
            c= s.charAt(i);
            if(c=='*' && !stk.isEmpty()) stk.pop();
            else stk.push(c);            
        }
        while(!stk.isEmpty()){
            res= stk.pop() + res;
        }
        return res;
    }
    // Optimized solution
    public String removeStarsOptimized(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
