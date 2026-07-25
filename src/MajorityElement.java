import java.util.Arrays;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int freq = 0, maj = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                maj = nums[i];
            }
            if (maj == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return maj;
    }
        public static void main(String[] args) {
            int[] nums = {3, 2, 3};

            int result = majorityElement(nums);

            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Majority element: " + result);
    }
}
