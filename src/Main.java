import java.util.Arrays;

public class Main {

    public static int removeDuplicates(int[] nums) {

        // If the array is empty, there are 0 unique elements
        if (nums.length == 0) {
            return 0;
        }

        // i points to the last unique element
        int i = 0;

        // j scans the array
        for (int j = 1; j < nums.length; j++) {

            // If a new unique element is found
            if (nums[j] != nums[i]) {

                // Move i to the next position
                i++;

                // Store the unique element there
                nums[i] = nums[j];
            }
        }

        // Number of unique elements
        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Shows the complete modified array
        System.out.println("Modified array: " + Arrays.toString(nums));
    }
}
