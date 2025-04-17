public class longestCommonPrefix {

    //Not Optimal solution, but works
    public String longestCommonPrefix(String[] strs) {

        String substring=  minimumlengthString(strs);

        for(String word : strs){
            while(!substring.equals(word.substring(0,substring.length()))){
                if(substring.equals(""))
                return substring;
                substring=substring.substring(0,substring.length()-1);

            }
        }
  
        return substring;
        
    }

    public static String minimumlengthString(String[] strs){
        String s= strs[0];
        for(String word : strs){
            if(word.length()< s.length())
            s=word;
        }
        return s;
    }

    //Optimal solution
    public String longestCommonPrefixOptimized(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }




}
