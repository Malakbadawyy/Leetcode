public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
    int index=1;
    if(nums.length == 0) return 0;
    int current= nums[0];
    for(int i=1 ; i <nums.length; i++){
        if(current != nums[i]){
            current= nums[i];
            nums[index] = current;
            index++;
        }
    }
    return index;
    }
}
