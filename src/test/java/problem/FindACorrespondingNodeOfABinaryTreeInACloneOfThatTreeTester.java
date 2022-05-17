package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTester {
    FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree findACorrespondingNodeOfABinaryTreeInACloneOfThatTree =
            new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();


    @Test
    public void example1(){
        TreeNode<Integer> tree = new TreeNode<>(7,4,3,null,null,6,19);
        TreeNode<Integer> target = new TreeNode<>(3,6,19);

        TreeNode<Integer> actual = findACorrespondingNodeOfABinaryTreeInACloneOfThatTree.getTargetCopy(tree,tree,target);


        assertEquals(target, actual);
    }

    @Test
    public void example2(){
        TreeNode<Integer> tree = new TreeNode<>(7);
        TreeNode<Integer> target = new TreeNode<>(7,null,null);

        TreeNode<Integer> actual = findACorrespondingNodeOfABinaryTreeInACloneOfThatTree.getTargetCopy(tree,tree,target);


        assertEquals(target, actual);
    }

    @Test
    public void example3(){
        TreeNode<Integer> tree = new TreeNode<>(8,null,6,null,5,null,4,null,3,null,2,null,1);
        TreeNode<Integer> target = new TreeNode<>(4,null,3);

        TreeNode<Integer> actual = findACorrespondingNodeOfABinaryTreeInACloneOfThatTree.getTargetCopy(tree,tree,target);


        assertEquals(target, actual);
    }
}
