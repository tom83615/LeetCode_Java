package problem;

import problem.object.TreeNode;

public class RecoverBinarySearchTree {
//    You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
//
//
//
//    Example 1:
//    Input: root = [1,3,null,null,2]
//    Output: [3,1,null,null,2]
//    Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
//
//    Example 2:
//    Input: root = [3,1,4,null,null,2]
//    Output: [2,1,4,null,null,3]
//    Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
//
//
//    Constraints:
//    The number of nodes in the tree is in the range [2, 1000].
//      -231 <= Node.val <= 231 - 1
//
//
//    Follow up: A solution using O(n) space is pretty straight-forward. Could you devise a constant O(1) space solution?

    TreeNode<Integer> prev = null,first=null,second=null;

    public void recoverTree(TreeNode<Integer> root) {
        helper(root);
        swap(first,second);
        return ;
    }

    public void swap(TreeNode<Integer> a,TreeNode<Integer> b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    public void helper(TreeNode<Integer> root){
        if(root == null){
            return ;
        }

        // check left
        helper(root.left);

        // check parents
        if(prev!=null &&  prev.val > root.val)
        {
            if(first == null)
            {
                first = prev;
            }
            second = root;
        }
        prev = root;

        // check right
        helper(root.right);
    }
}
