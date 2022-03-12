package problem;

import problem.object.ListNode;

public class RotateList {

//    Given the head of a linked list, rotate the list to the right by k places.
//
//
//    Example 1:
//    Input: head = [1,2,3,4,5], k = 2
//    Output: [4,5,1,2,3]
//
//    Example 2:
//    Input: head = [0,1,2], k = 4
//    Output: [2,0,1]
//
//    Constraints:
//    The number of nodes in the list is in the range [0, 500].
//    -100 <= Node.val <= 100
//    0 <= k <= 2 * 109

    public static ListNode<Integer> rotateRight(ListNode<Integer> head, int k) {
        if( head == null || k==0) return head;

        int size = 1;
        ListNode<Integer> ilter = head;
        while(ilter.next != null){
            ilter = ilter.next;
            size++;
        }
        k %= size;

        while(k-- > 0){
            ListNode<Integer> x = head;
            int preValue = x.val;
            x = x.next;

            while( x != null ){
                int temp = x.val;
                x.val = preValue;
                preValue = temp;
                x= x.next;
            }
            head.val = preValue;
        }
        return head;
    }
}
