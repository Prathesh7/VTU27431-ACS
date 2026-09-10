class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        postorder(root, result);

        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // Left
        postorder(root.left, result);

        // Right
        postorder(root.right, result);

        // Root
        result.add(root.val);
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2
Case 3
Case 4

Input:
root = [1, null, 2, 3]

Output:
[3, 2, 1]

Expected:
[3, 2, 1]
