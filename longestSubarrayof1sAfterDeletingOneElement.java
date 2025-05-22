public class longestSubarrayof1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int start=0;
        int end=0;
        int maxones=0;
        int k=1;
        while(end<nums.length){
            if(nums[end]!=1) k--;
            while(k<0) {
                if(nums[start]!=1) k++;
                start++;
            }
            maxones= Math.max(maxones,end-start+1);
            end++;   

        }
        return maxones-1 ;
    }
}
