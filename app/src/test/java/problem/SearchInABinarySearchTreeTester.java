package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInABinarySearchTreeTester {
    SearchInABinarySearchTree searchInABinarySearchTree = new SearchInABinarySearchTree();

    @Test
    public void example1(){
        TreeNode<Integer> root = new TreeNode<>(4,2,7,1,3);
        int val = 2;
        TreeNode<Integer> Actual = new TreeNode<>(2,1,3);

        TreeNode<Integer> result = searchInABinarySearchTree.searchBST(root, val);
        assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        TreeNode<Integer> root = new TreeNode<>(4,2,7,1,3);
        int val = 5;
        TreeNode<Integer> Actual = null;

        TreeNode<Integer> result = searchInABinarySearchTree.searchBST(root, val);
        assertEquals(Actual, result);
    }
}
