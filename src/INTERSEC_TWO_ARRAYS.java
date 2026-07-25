import java.util.*;
public class INTERSEC_TWO_ARRAYS {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        // Add all elements of nums2 to set1
        for (int num : nums2) {
            set1.add(num);
        }

        Set<Integer> result_F = new HashSet<>();

        // Find common elements
        for (int num : nums1) {
            if (set1.contains(num)) {
                result_F.add(num);
            }
        }

        // Convert Set to Array
        int[] result = new int[result_F.size()];
        int index = 0;

        for (int num : result_F) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}

