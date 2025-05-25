import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        int complement;
        int[] results = new int[2];
        for(int i=0;i<nums.length;i++){
            complement= target - nums[i];
            if(numsMap.containsKey(nums[i])){
                results[0] = numsMap.get(nums[i]);
                results[1] = i;
                return results;
            }
            else{
                numsMap.put(complement, i);
            }
        }
        return results;

    }
}
