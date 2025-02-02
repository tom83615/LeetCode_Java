package problem;

import problem.object.TreeNode;

import java.util.ArrayList;

public class IncreasingOrderSearchTree {
//    Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
//
//
//
//    Example 1:
//    Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//    Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
//
//    Example 2:
//    Input: root = [5,1,7]
//    Output: [1,null,5,null,7]
//
//    Constraints:
//    The number of nodes in the given tree will be in the range [1, 100].
//            0 <= Node.val <= 1000
    ArrayList<Integer> list = new ArrayList<>();

    public TreeNode<Integer> increasingBST(TreeNode<Integer>  root) {
        slove(root, list);
        return buildNode(list);
    }

    private void slove(TreeNode<Integer>  root, ArrayList<Integer> list){
        if(root == null) return;
        slove(root.left, list);
        list.add(root.val);
        slove(root.right, list);
    }

    private TreeNode<Integer> buildNode(ArrayList<Integer> list){
        if(list.size() == 0) return null;
        TreeNode<Integer>  root = new TreeNode<>(list.remove(0));
        root.right = buildNode(list);
        return root;
    }
}
