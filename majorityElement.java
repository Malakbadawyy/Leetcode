public class majorityElement {
        public int majorityElement(int[] nums) {
        if(nums.length==0) return 0;
        int elem= nums[0];
        int counter=0;
        for(int i = 0 ; i<nums.length;i++){
            if(counter==0) elem = nums[i];
            if(elem!= nums[i])counter--;
            else counter++;
        }
        return elem;
    }
}
