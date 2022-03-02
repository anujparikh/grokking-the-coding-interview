package fastandslowpointers;

import utils.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        TreeNode current = root;
        if (current == null) {
            return true;
        }
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode input, Integer min, Integer max) {
        if (input == null){
            return true;
        }
        if ((min != null && input.val <= min) || (max != null && input.val >= max)) {
            return false;
        }
        return dfs(input.left, min, input.val) && dfs(input.right, input.val, max);
    }
}
