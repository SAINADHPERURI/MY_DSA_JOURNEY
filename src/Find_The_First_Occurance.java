import java.util.*;
public class Find_The_First_Occurance {

    public static int strStr(String haystack, String needle) {

        // Edge case: empty needle
        if (needle.length() == 0) {
            return 0;
        }

        // Try every possible starting position
        for (int start = 0;
             start <= haystack.length() - needle.length();
             start++) {

            boolean match = true;

            // Compare needle with haystack
            for (int j = 0; j < needle.length(); j++) {

                if (haystack.charAt(start + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }

            // Entire needle matched
            if (match) {
                return start;
            }
        }

        // Needle not found
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "HAPPYLIFE";
        String needle = "LIFE";

        int result = strStr(haystack, needle);

        System.out.println("Haystack: " + haystack);
        System.out.println("Needle: " + needle);
        System.out.println("First occurrence index: " + result);
    }
}