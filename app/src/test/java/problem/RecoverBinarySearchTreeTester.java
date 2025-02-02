package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoverBinarySearchTreeTester {

    RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree();

    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(1,3,null,null,2);
        TreeNode<Integer> Actual = new TreeNode<>(3,1,null,null,2);

        recoverBinarySearchTree.recoverTree(root);

        assertEquals(Actual, root);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(3,1,4,null,null,2);
        TreeNode<Integer> Actual = new TreeNode<>(2,1,4,null,null,3);

        recoverBinarySearchTree.recoverTree(root);

        assertEquals(Actual, root);
    }
}
