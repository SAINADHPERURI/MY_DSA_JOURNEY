import java.util.*;

public class find_the_missing_number_from_the_array {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Add all numbers from nums into the Set
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();

        // Check which numbers from 1 to nums.length are missing
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + result);
    }
}