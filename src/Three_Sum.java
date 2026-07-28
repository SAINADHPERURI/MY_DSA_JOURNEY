import java.util.*;

public class Three_Sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            // Two pointer approach
            while (j < k) {

                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;

                } else if (total < 0) {
                    j++;

                } else {

                    // Found a triplet
                    res.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k]
                    ));

                    j++;

                    // Skip duplicate values for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets that sum to 0:");

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}