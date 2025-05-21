public class findPivotIndex {

    public int pivotIndex(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        //Left
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]+left[i-1];
        }
        //Right
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i+1]+right[i+1];
        }
        //Result
        for(int i=0; i<nums.length;i++){
            if(left[i]==right[i]) return i;
        }
        return -1;
        
    }
}

