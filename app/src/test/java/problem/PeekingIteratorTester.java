package problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PeekingIteratorTester {

    @Test
    public void example1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        PeekingIterator peekingIterator = new PeekingIterator(list.iterator());
        assertEquals(1, peekingIterator.next());      // return 1, the pointer moves to the next element [1,2,3].
        assertEquals(2, peekingIterator.peek());      // return 2, the pointer does not move [1,2,3].
        assertEquals(2, peekingIterator.next());      // return 2, the pointer moves to the next element [1,2,3]
        assertEquals(3, peekingIterator.next());      // return 3, the pointer moves to the next element [1,2,3]
        assertFalse(peekingIterator.hasNext());                // return False
    }

    @Test
    public void example2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        PeekingIterator peekingIterator = new PeekingIterator(list.iterator());
        assertTrue(peekingIterator.hasNext());
        assertEquals(1, peekingIterator.peek());
        assertEquals(1, peekingIterator.peek());
        assertEquals(1, peekingIterator.next());
        assertEquals(2, peekingIterator.next());
        assertEquals(3, peekingIterator.peek());
        assertEquals(3, peekingIterator.peek());
        assertEquals(3, peekingIterator.next());
        assertTrue(peekingIterator.hasNext());
        assertEquals(4, peekingIterator.peek());
        assertTrue(peekingIterator.hasNext());
        assertEquals(4, peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }
}
