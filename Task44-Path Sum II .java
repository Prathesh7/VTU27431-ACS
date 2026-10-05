class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        findPaths(root, targetSum, path, result);

        return result;
    }

    private void findPaths(
            TreeNode root,
            int targetSum,
            List<Integer> path,
            List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.val);

        // Check if current node is a leaf
        if (root.left == null && root.right == null) {

            if (targetSum == root.val) {
                result.add(new ArrayList<>(path));
            }

        } else {

            // Search left subtree
            findPaths(root.left, targetSum - root.val, path, result);

            // Search right subtree
            findPaths(root.right, targetSum - root.val, path, result);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2
Case 3

Input:
root = [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1]
targetSum = 22

Output:
[[5, 4, 11, 2], [5, 8, 4, 5]]

Expected:
[[5, 4, 11, 2], [5, 8, 4, 5]]
