import java.util.Stack;

public class isValidParenthesis {
  public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else{
                
                if(c==')'){
                    if(stack.isEmpty()) return false;
                    if(stack.pop()!='(') return false;
                }
                else  if(c=='}'){
                    if(stack.isEmpty()) return false;
                    if(stack.pop()!='{') return false;
                }
                else  if(c==']'){
                    if(stack.isEmpty()) return false;
                    if( stack.pop() !='[') return false;
                }
            }
        } 
        if(!stack.isEmpty()) return false;
        return true;
    }
}
