package problem;

import problem.object.TreeNode;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
//    Given two binary trees original and cloned and given a reference to a node target in the original tree.
//
//    The cloned tree is a copy of the original tree.
//
//    Return a reference to the same node in the cloned tree.
//
//    Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.
//
//
//
//    Example 1:
//    Input: tree = [7,4,3,null,null,6,19], target = 3
//    Output: 3
//    Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.
//
//    Example 2:
//    Input: tree = [7], target =  7
//    Output: 7
//
//    Example 3:
//    Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
//    Output: 4
    public final TreeNode<Integer> getTargetCopy(final TreeNode<Integer> original, final TreeNode<Integer> cloned, final TreeNode<Integer> target) {
        if(cloned == null){
            return null;
        }
        if(Objects.equals(cloned.val, target.val)){
            return cloned;
        }

        TreeNode<Integer> result = getTargetCopy(original.left, cloned.left, target);
        if(result == null){
            result = getTargetCopy(original.right, cloned.right, target);
        }
        return result;
    }
}
