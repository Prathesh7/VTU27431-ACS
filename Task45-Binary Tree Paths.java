class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        findPaths(root, "", result);

        return result;
    }

    private void findPaths(
            TreeNode root,
            String path,
            List<String> result) {

        if (root == null) {
            return;
        }

        // Add current node to the path
        if (path.isEmpty()) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }

        // If leaf, add complete path
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        // Traverse left and right
        findPaths(root.left, path, result);
        findPaths(root.right, path, result);
    }
}

OUTPUT:
Accepted

Runtime: 4 ms

Case 1
Case 2

Input:
root = [1, 2, 3, null, 5]

Output:
["1->2->5", "1->3"]

Expected:
["1->2->5", "1->3"]
