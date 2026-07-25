import java.util.Arrays;

public class pb3 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;      // Last valid element in nums1
        int j = n - 1;      // Last element in nums2
        int idx = m + n - 1;  // Last position in nums1

        while (i >= 0 && j >= 0) {

            if (nums1[i] >= nums2[j]) {
                nums1[idx--] = nums1[i--];
            } else {
                nums1[idx--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2, if any
        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}