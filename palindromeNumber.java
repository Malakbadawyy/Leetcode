public class palindromeNumber {
    public boolean isPalindrome(int x) {
       String s= x+"";
       int end = s.length()-1;
       for(int i = 0;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(end))
            return false;
        end--;    
       } 
       return true;
    }
}
