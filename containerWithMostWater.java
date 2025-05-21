public class containerWithMostWater {
    class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int maxArea=0;
        int heightvalue;
        int width;
        int area;
        while (left<right){
            heightvalue= Math.min(height[left],height[right]);
            width= right-left;
            area= width * heightvalue;

            if(area>maxArea)
                maxArea=area;
         
              if(Math.min(height[left],height[right])==height[right])
            {
                right--;
            }
            else if(Math.min(height[left],height[right])==height[left])
            {
                left++;
            }
           


        }
        return maxArea;
    }
    
}
    
}
