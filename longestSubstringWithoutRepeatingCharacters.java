import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
       //Third Solution using HashMap and last occurences
     public int lengthOfLongestSubstring(String s) {
     
        if(s.equals("")) return 0;
        int left= 0;
        int max= 0;
        HashMap<Character,Integer> char_set= new HashMap<Character,Integer>();
        for(int right=0; right<s.length();right++){
            if((char_set.containsKey(s.charAt(right))) && (char_set.getOrDefault(s.charAt(right), 0)>=left)){
                left= char_set.get(s.charAt(right))+1 ;
                char_set.put(s.charAt(right), right);
            }

            char_set.put(s.charAt(right), right);

            if(right-left +1 > max) max = right-left +1;
           
        }
        return max;
       
    }


    public int lengthOfLongestSubstringUsingSlidingWindow(String s) {
     int start=0;
     int end=0;
     int maxlength=0;
     String currentSubs;
     while(start<=end && end<s.length()){
            currentSubs= s.substring(start,end);
            while(currentSubs.contains(s.charAt(end)+"")){
                start++;
                currentSubs= s.substring(start,end);
            }
            end ++;
            currentSubs= s.substring(start,end);
            if(maxlength<currentSubs.length())
            maxlength= currentSubs.length();
    }
    return maxlength;
       
    }

        public int lengthOfLongestSubstringusingSlidingWindowAndHashMap(String s) {
        //First Solution using Sliding Window and HashMap
        if(s.equals("")) return 0;
        int left= 0;
        int max= 0;
        HashMap<Character,Integer> char_set= new HashMap<Character,Integer>();
        for(int right=0; right<s.length();right++){
            char_set.put(s.charAt(right), char_set.getOrDefault(s.charAt(right), 0)+1);
            
            while(char_set.getOrDefault(s.charAt(right), 0)>1){
                char_set.put(s.charAt(left), char_set.get(s.charAt(left))-1);
                left++;
            }
            if(right-left +1 > max) max = right-left +1;
           
        }
        return max;
       
    }
}
