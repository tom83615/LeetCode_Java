package problem;

import problem.object.ListNode;

//        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example 1:
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
//
//        Example 2:
//        Input: l1 = [0], l2 = [0]
//        Output: [0]
//        Example 3:
//
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]
//
//        Constraints:
//
//        The number of nodes in each linked list is in the range [1, 100].
//        0 <= Node.val <= 9
//        It is guaranteed that the list represents a number that does not have leading zeros.
public class AddTwoNumbers {
    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        return calaN(l1, l2, 0);
    }

    public static ListNode<Integer> calaN(ListNode<Integer> l1, ListNode<Integer> l2, int res){
        if (l1 == null && l2 == null && res == 0){
            return null;
        }

        if (l1 == null){
            l1 = new ListNode<Integer>(0);
        }

        if (l2 == null){
            l2 = new ListNode<Integer>(0);
        }

        int val = (l1.val+ l2.val+ res)%10;
        int nextRes = (l1.val+ l2.val+ res)/10;
        return new ListNode<Integer>(val, calaN(l1.next, l2.next, nextRes));
    }
}
