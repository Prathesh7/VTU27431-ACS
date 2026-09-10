class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // Root
        result.add(root.val);

        // Left
        preorder(root.left, result);

        // Right
        preorder(root.right, result);
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
[1, 2, 3]

Expected:
[1, 2, 3]
