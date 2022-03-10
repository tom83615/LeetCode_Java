package problem.object;


import java.util.Arrays;
import java.util.Objects;

/**
 * This is common LeetCode's singly-linked list.
 **/
public class ListNode<E> {
    public E val;
    public ListNode next;


    public ListNode() {}
    public ListNode(E val) { this.val = val; }
    public ListNode(E val, ListNode next) { this.val = val; this.next = next; }
    public ListNode(E... val) {
        this.val = val[0];
        if (val.length > 1) {
            this.next = new ListNode(Arrays.copyOfRange(val, 1, val.length));
        }
    }

    public String toString(){
        if(next != null){
            return val + "," + next.toString();
        }else{
            return String.valueOf(val);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && ((next == null && listNode.next == null) || next.equals(listNode.next));
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
