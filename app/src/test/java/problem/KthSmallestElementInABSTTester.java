package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInABSTTester {
    KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();

    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(3,1,4,null,2);
        int k = 1;

        int Actual = 1;

        int result = kthSmallestElementInABST.kthSmallest(root, k);

        assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(5,3,6,2,4,null,null,1);
        int k = 3;

        int Actual = 3;

        int result = kthSmallestElementInABST.kthSmallest(root, k);

        assertEquals(Actual, result);
    }
}
