class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        for(int i =0 ; i< word1.length();i++){
            merged+= word1.charAt(i);
            if(i<word2.length())
            merged+= word2.charAt(i);
        }
        if(word1.length()<word2.length())
        {
            merged += word2.substring(word1.length(),word2.length());
        }
        return merged;
    }
}


/*
Similar code with StringBuilder for better performance:
 * class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
 */