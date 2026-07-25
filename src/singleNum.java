import java.util.Arrays;

public class singleNum {

    public static int singleNumber(int[] nums) {
        int answer = 0;

        for (int number : nums) {
            answer ^= number;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println("Array: " + Arrays.toString(nums));

        int result = singleNumber(nums);

        System.out.println("Single number: " + result);
    }
}