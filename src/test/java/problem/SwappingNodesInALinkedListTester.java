package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.object.ListNode;

public class SwappingNodesInALinkedListTester {

    @Test
    public void example1(){
        ListNode<Integer> head = new ListNode<>(7,9,6,6,7,8,3,0,9,5);
        int k = 5;
        ListNode<Integer> result = new ListNode<>(7,9,6,6,8,7,3,0,9,5);

        ListNode<Integer> actual = SwappingNodesInALinkedList.swapNodes(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        ListNode<Integer> head = new ListNode<>(1,2,3,4,5);
        int k = 2;
        ListNode<Integer> result = new ListNode<>(1,4,3,2,5);

        ListNode<Integer> actual = SwappingNodesInALinkedList.swapNodes(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        ListNode<Integer> head = new ListNode<>(1,2,3);
        int k = 2;
        ListNode<Integer> result = new ListNode<>(1,2,3);

        ListNode<Integer> actual = SwappingNodesInALinkedList.swapNodes(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        ListNode<Integer> head = new ListNode<>();
        int k = 0;
        ListNode<Integer> result = new ListNode<>();

        ListNode<Integer> actual = SwappingNodesInALinkedList.swapNodes(head, k);
        Assertions.assertEquals(result, actual);
    }
}
