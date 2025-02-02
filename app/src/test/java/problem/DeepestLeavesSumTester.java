package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeepestLeavesSumTester {

    DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();

    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(1,2,3,4,5,null,6,7,null,null,null,null,8);
        int expect = 15;

        int actual = deepestLeavesSum.deepestLeavesSum(root);

        assertEquals(expect, actual);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(6,7,8,2,7,1,3,9,null,1,4,null,null,null,5);
        int expect = 19;

        int actual = deepestLeavesSum.deepestLeavesSum(root);

        assertEquals(expect, actual);
    }
}
