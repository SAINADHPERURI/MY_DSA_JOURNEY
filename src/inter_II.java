import java.util.*;

public class inter_II {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();

        // Check elements of nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert ArrayList to int[]
        int[] res = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            res[i] = resultList.get(i);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5,6,9};
        int[] nums2 = {4,9};

        int[] result = intersect(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
