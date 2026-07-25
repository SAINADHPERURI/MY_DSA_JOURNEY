class PB4 {

    // Tree node definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public TreeNode sortedArrayToBST(int[] nums) {

            if (nums.length == 0) {
                return null;
            }

            return constructTreeFromArray(nums, 0, nums.length - 1);
        }

        public TreeNode constructTreeFromArray(int[] nums, int left, int right) {

            // Base case
            if (left > right) {
                return null;
            }

            // Find middle index
            int mid = left + (right - left) / 2;

            // Create node using middle element
            TreeNode root = new TreeNode(nums[mid]);

            // Construct left subtree
            root.left =
                    constructTreeFromArray(nums, left, mid - 1);

            // Construct right subtree
            root.right =
                    constructTreeFromArray(nums, mid + 1, right);

            return root;
        }
    }

    // Print tree using preorder traversal
    static void printTree(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        Solution solution = new Solution();

        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("Preorder traversal of BST:");

        printTree(root);
    }
}
