public class minSubArrayLength {
        public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int minSize= Integer.MAX_VALUE;
        int currSum=0;
    
        while(end<nums.length){
            currSum+=nums[end];
            while(start<=end && currSum-nums[start]>=target ){
                currSum-=nums[start];
                start++;
            }
          
            if(end<nums.length){
            if(currSum>=target)
                minSize= Math.min(minSize,end-start+1); 
            }   
            end++;
        }
        return minSize== Integer.MAX_VALUE ? 0: minSize;
    }
}
