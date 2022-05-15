package problem;

import problem.object.TreeNode;

public class DeepestLeavesSum {
    int sum, maxDeep;
    public int deepestLeavesSum(TreeNode<Integer> root) {
        sum = 0; maxDeep = 0;
        helper(root, 0);
        return sum;
    }

    private void helper(TreeNode<Integer> root, int deep){
        if(root != null){
            if(root.left == null && root.right == null){
                if(deep > maxDeep){
                    sum = 0;
                    maxDeep = deep;
                }
                if(deep == maxDeep){
                    sum += root.val;
                }
            }else{
                helper(root.left, deep+1);
                helper(root.right, deep+1);
            }
        }
    }
}
