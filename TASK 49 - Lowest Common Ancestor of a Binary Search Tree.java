class Solution {

    public TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        while (root != null) {

            // Both nodes are smaller than root
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            // Both nodes are greater than root
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            // They are on different sides, or root is p/q
            else {
                return root;
            }
        }

        return null;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2
Case 3

Input:
root = [6, 2, 8, 0, 4, 7, 9, null, null, 3, 5]
p = 2
q = 8

Output:
6

Expected:
6
