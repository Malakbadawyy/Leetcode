public class medianOfTwoSortedArrays {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int medianindex=0;
        if((nums1.length+nums2.length)%2 != 0){
            medianindex = (nums1.length+nums2.length)/2;
        }
        else{
             medianindex = ((nums1.length+nums2.length)/2) ;
        }

        int i = 0;
        int j = 0;
        int prev = 0 ;
        int curr= 0 ;
        while(i+j<medianindex+1){
            prev= curr;
            if(i== nums1.length){
                curr= nums2[j];
                j++;
            }else if (j == nums2.length){
                curr= nums1[i];
                i++;
            }
            else{
                if(nums1[i]<=nums2[j]){
                curr= nums1[i];
                i++;
                }
                else{
                curr= nums2[j];
                j++;
                }
            }
        }
         if((nums1.length+nums2.length)%2 != 0){
            return (double)curr;
        }
        else{
             return (prev+curr)/(double)2;
        }

    }

    // binary search approach

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays2(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Handle edge cases with -∞ and +∞
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            // Correct partition found
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            }
            // Move left
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            }
            // Move right
            else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

}
