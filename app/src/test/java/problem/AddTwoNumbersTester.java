package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.object.ListNode;

public class AddTwoNumbersTester {
    @Test
    public void example1(){
        ListNode<Integer> l1 = new ListNode<>(2,4,3);
        ListNode<Integer> l2 = new ListNode<>(5,6,4);
        ListNode<Integer> Actual = new ListNode<>(7,0,8);
        ListNode<Integer> result = AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        ListNode<Integer> l1 = new ListNode<>(0);
        ListNode<Integer> l2 = new ListNode<>(0);
        ListNode<Integer> Actual = new ListNode<>(0);
        ListNode<Integer> result = AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        ListNode<Integer> l1 = new ListNode<>(9,9,9,9,9,9,9);
        ListNode<Integer> l2 = new ListNode<>(9,9,9,9);
        ListNode<Integer> Actual = new ListNode<>(8,9,9,9,0,0,0,1);
        ListNode<Integer> result = AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(Actual, result);
    }
}
