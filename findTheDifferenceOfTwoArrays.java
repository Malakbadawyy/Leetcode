import java.util.* ; 
public class findTheDifferenceOfTwoArrays {
     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);

        for (int n : nums2) set2.add(n);

        List<List<Integer>> result = new ArrayList<>();
        
        Set<Integer> onlyIn1 = new HashSet<>(set1);
        Set<Integer> onlyIn2 = new HashSet<>(set2);

        onlyIn1.removeAll(set2);
        onlyIn2.removeAll(set1);

        result.add(new ArrayList<>(onlyIn1));
        result.add(new ArrayList<>(onlyIn2));

        return result;
    }
}
