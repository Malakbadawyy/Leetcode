public class reverseWordsInAString {
    public String reverseWords(String s) {
        String[] stringArray = s.split("\\s+");
        String res= "";
        for(int i=0; i<stringArray.length;i++){
           res+= stringArray[stringArray.length-i-1] + " ";
        }
        return res.trim();
    }
}
