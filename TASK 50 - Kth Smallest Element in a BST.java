class Solution {

    int count = 0;
    int answer = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return answer;
    }

    private void inorder(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, k);

        // Root
        count++;

        if (count == k) {
            answer = root.val;
            return;
        }

        // Right
        inorder(root.right, k);
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2

Input:
root = [3, 1, 4, null, 2]
k = 1

Output:
1

Expected:
1
