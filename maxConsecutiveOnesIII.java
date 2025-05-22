public record maxConsecutiveOnesIII() {
  public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int maxones=0;
        while(end<nums.length){
            if(nums[end]==0) k--;
            while(k<0) {
                if(nums[start]==0)k++;
                start++; 
            }
            maxones= Math.max(maxones,end-start+1);
            end++;
        }
        return maxones;

    }
}
