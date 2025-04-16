import java.util.HashSet;
import java.util.Stack;

public class reverseVowelsOfString {
   
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> charSet = new HashSet<>();
        String res="";
        charSet.add('a');
        charSet.add('e');
        charSet.add('i');
        charSet.add('o');
        charSet.add('u');
        charSet.add('A');
        charSet.add('E');
        charSet.add('I');
        charSet.add('O');
        charSet.add('U');
        for(int i=0;i<s.length();i++){
            if(charSet.contains(s.charAt(i)))
                stack.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(charSet.contains(s.charAt(i)))
                res+= stack.pop();
            else
                res+= s.charAt(i);    
            
        }

        return res;

        
    }
}

