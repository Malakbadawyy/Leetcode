import java.util.HashSet;

public class longestConsecutiveSequence {
        public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        int maxCount = 0;
        for (int num : nums)
            set.add(num);

        for (int num : set) {
            count = 0;
            if (set.contains(num - 1))
                continue;
            else{    
            while (set.contains(num)) {
                num++;
                count++;
                
            }
            maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
