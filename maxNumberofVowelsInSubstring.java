import java.util.HashSet;

public class maxNumberofVowelsInSubstring {

    //intuitive sliding window
    //time complexity O(n)
     public int maxVowels(String s, int k) {
        HashSet<Character> h= new HashSet<Character>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        int num=0;
        int maxnum=0;
        for(int i=0; i<k; i++){
            if(h.contains(s.charAt(i))) num++;
        }
        if(num==k) return num;
        maxnum=num;
        for (int i=0 ; i<s.length()-k;i++){
            if(h.contains(s.charAt(i))) num--;
            if(h.contains(s.charAt(i+k))) num++;
            if(maxnum<num) maxnum=num;
            if(maxnum==k) return maxnum;
        }
         return maxnum;
    }

    
}
