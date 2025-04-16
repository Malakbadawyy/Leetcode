import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> solution = new ArrayList<Boolean>(candies.length);
        int max= getMax(candies);
        for(int i=0 ; i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                solution.add(true);
            else 
                solution.add(false);
        }
        return solution;
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i=0 ; i<arr.length;i++){
            if(arr[i]>max)
                max= arr[i];
        } 
        return max;
    }
}