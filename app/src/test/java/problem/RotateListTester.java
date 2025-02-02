package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.object.ListNode;

public class RotateListTester {

    @Test
    public void example1(){
        ListNode<Integer> head = new ListNode<>(1,2,3,4,5);
        int k = 2;
        ListNode<Integer> result = new ListNode<>(4,5,1,2,3);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        ListNode<Integer> head = new ListNode<>(0,1,2);
        int k = 4;
        ListNode<Integer> result = new ListNode<>(2,0,1);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        ListNode<Integer> head = new ListNode<>();
        int k = 0;
        ListNode<Integer> result = new ListNode<>();
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        ListNode<Integer> head = new ListNode<>(1);
        int k = 1;
        ListNode<Integer> result = new ListNode<>(1);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        ListNode<Integer> head = new ListNode<>(1,2);
        int k = 0;
        ListNode<Integer> result = new ListNode<>(1,2);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example6(){
        ListNode<Integer> head = new ListNode<>(0,1,2,3);
        int k = 4;
        ListNode<Integer> result = new ListNode<>(0,1,2,3);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example7(){
        ListNode<Integer> head = new ListNode<>(1,2);
        int k = 1;
        ListNode<Integer> result = new ListNode<>(2,1);
        ListNode<Integer> actual = RotateList.rotateRight(head, k);
        Assertions.assertEquals(result, actual);
    }
}