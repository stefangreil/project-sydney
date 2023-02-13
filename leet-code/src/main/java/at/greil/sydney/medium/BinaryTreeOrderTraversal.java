package at.greil.sydney.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        TreeNode tempRoot = root;
        List<List<Integer>> result = new ArrayList<>();
        int level = 1;

        if (root != null && root.val > 0) {
            result.add(Arrays.asList(root.val));
        } else {
            return new ArrayList<>();
        }

        while (tempRoot != null) {
            List<Integer> tempNode = new ArrayList<>();
            if (tempRoot.left != null) {
                if (tempRoot.left.val >= 0) {
                    tempNode.add(tempRoot.left.val);
                }
                if (tempRoot.right != null && tempRoot.right.val >= 0) {
                    tempNode.add(tempRoot.right.val);
                }
                tempRoot = tempRoot.left;
            } else {
                if (tempRoot.right != null && tempRoot.right.val >= 0) {
                    tempNode.add(tempRoot.right.val);
                }
                TreeNode innerTempRoot = root;
                for (int i = 0; i < level; i++) {
                    assert innerTempRoot != null;
                    innerTempRoot = innerTempRoot.right;
                }
                tempRoot = innerTempRoot;
                if (tempRoot != null && tempRoot.right == null) {
                    tempRoot = null;
                }
                level++;
            }
            if (!tempNode.isEmpty()) {
                result.add(tempNode);
            }
        }

        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}