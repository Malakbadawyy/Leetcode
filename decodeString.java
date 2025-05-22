import java.util.Stack;

public class decodeString {
    public String decodeString(String s) {
        Stack<Integer> nums= new Stack<Integer>();
        Stack<String> strings= new Stack<String>();
        String k= "";
        String curr="";
        String res="";
        for(char c: s.toCharArray()){
            if(c>='0' && c<='9'){
                k += c;
            }
            if(c== '['){
                nums.push(Integer.parseInt(k));
                k="";
                strings.push(curr);
                curr="";
            }
            if(c>='a' && c<='z'){
                curr+=c;
            }
            else if (c == ']') {
                int n = nums.pop();
                String temp = "";
                for (int i = 0; i < n; i++) {
                    temp += curr;
                }
                curr = strings.pop() + temp;  // Combine with previous string
            }
        }

        return curr;  // Final result
    }



}
