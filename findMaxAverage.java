public class findMaxAverage {
        public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+= nums[i];
        }
        int maxSum=sum;
        for(int i=0;i<nums.length-k;i++){
            sum= sum +nums[i+k] - nums[i];
            if(sum>maxSum) maxSum=sum;
        }
        return  (double)maxSum/k;
    }
}
