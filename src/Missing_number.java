import java.util.Scanner;

public class Missing_number {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum =  n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : nums) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
        int[] nums = {4,2, 0, 1};

        int result = findMissingNumber(nums);

        System.out.println("Missing number: " + result);
    }
}