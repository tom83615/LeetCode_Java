package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncreasingOrderSearchTreeTester {
    IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();

    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(5,3,6,2,4,null,8,1,null,null,null,7,9);
        TreeNode<Integer> Actual = new TreeNode<>(1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9);

        TreeNode<Integer> result = increasingOrderSearchTree.increasingBST(root);

        assertEquals(Actual,result);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(5,1,7);
        TreeNode<Integer> Actual = new TreeNode<>(1,null,5,null,7);

        TreeNode<Integer> result = increasingOrderSearchTree.increasingBST(root);

        assertEquals(Actual,result);
    }
}
