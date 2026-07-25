import java.util.HashSet;

public class contains_duplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int start = 0;
        int end = 0;

        HashSet<Integer> seen = new HashSet<>();

        while (end < nums.length) {
            if (seen.contains(nums[end])) {
                return true;
            }

            seen.add(nums[end]);

            // Keep only the last k numbers in the HashSet
            if (end - start >= k) {
                seen.remove(nums[start]);
                start++;
            }

            end++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Result: " + result);
    }
}
