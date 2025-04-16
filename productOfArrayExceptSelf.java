public class productOfArrayExceptSelf {
 
        public int[] productExceptSelf(int[] nums) {
            int totalNumbers= nums.length-1;
            int counter=totalNumbers;
            int start;
            int product =1;
            int[] result= new int[nums.length];
            for(int i=0; i<nums.length;i++){
               start = i+1;
               while(counter!=0){
                if(start<nums.length){
                    product*= nums[start];
                    counter--;
                }
                else{
                    start=0;
                    product*= nums[start];
                    counter--;
                }
                start++;
               }
               result[i]=product;
               product=1;
               counter= totalNumbers;
            }
            return result; 
        }

        //IN O()n) time complexity

        public int[] productExceptSelfOn(int[] nums) {
            int[] left= new int[nums.length];
            int[] right= new int[nums.length];
            int[] res= new int[nums.length];
            int product=1;
     
            //LEFT
            for(int i=0; i<nums.length;i++){
             if(i==0)
                 left[i]=1;
             else if(i==1)
                 left[i]= nums[i-1];
             else 
                 left[i]=left[i-1]*nums[i-1];   
            } 
     
     
          //RIGHT   
         for(int i=nums.length-1; i>=0;i--){
             if(i==nums.length-1)
                 right[i]=1;
             else if(i==nums.length-2)
                 right[i]= nums[i+1];
             else 
                 right[i]=right[i+1]*nums[i+1];   
         }
         //RESULT
          for(int i=0;i<nums.length;i++){
             res[i]= left[i]*right[i];
          } 
          return res;
         }
     
    
}
