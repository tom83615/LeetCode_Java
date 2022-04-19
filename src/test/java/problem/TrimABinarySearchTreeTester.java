package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrimABinarySearchTreeTester {
    TrimABinarySearchTree trimABinarySearchTreeTester = new TrimABinarySearchTree();


    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(1,0,2);
        int low = 1, high = 2;
        TreeNode<Integer> Actual = new TreeNode<>(1,null,2);

        TreeNode<Integer> result = trimABinarySearchTreeTester.trimBST(root, low, high);

        assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(3,0,4,null,2,null,null,1);
        int low = 1, high = 3;
        TreeNode<Integer> Actual = new TreeNode<>(3,2,null,1);

        TreeNode<Integer> result = trimABinarySearchTreeTester.trimBST(root, low, high);

        assertEquals(Actual, result);
    }
}
