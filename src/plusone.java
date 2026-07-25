import java.util.Arrays;

public class plusone {

    public static int[] plusone(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and move left
            digits[i] = 0;
        }

        // Special case: all digits were 9
        // Example: [9, 9, 9] -> [1, 0, 0, 0]
         digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {

        int[] digits = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,};

        int[] answer = plusone(digits);

        System.out.println(Arrays.toString(answer));
    }
}