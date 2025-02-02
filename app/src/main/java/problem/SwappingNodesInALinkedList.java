package problem;

import problem.object.ListNode;

public class SwappingNodesInALinkedList {
//    You are given the head of a linked list, and an integer k.
//
//    Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
//
//
//
//    Example 1:
//
//
//    Input: head = [1,2,3,4,5], k = 2
//    Output: [1,4,3,2,5]
//    Example 2:
//
//    Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
//    Output: [7,9,6,6,8,7,3,0,9,5]
//
//
//    Constraints:
//
//    The number of nodes in the list is n.
//    1 <= k <= n <= 105
//    0 <= Node.val <= 100
//
    public static ListNode<Integer> swapNodes(ListNode<Integer> head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode<Integer> left = head;
        ListNode<Integer> right = head;
        int cnt = 0;
        // find the k-th node
        while (left != null) {
            cnt++;
            if (cnt == k) {
                break;
            }
            left = left.next;
        }

        // find the k-th last element
        ListNode<Integer> pNode = left;
        while (pNode.next != null) {
            pNode = pNode.next;
            right = right.next;
        }

        // swap their values.
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}
