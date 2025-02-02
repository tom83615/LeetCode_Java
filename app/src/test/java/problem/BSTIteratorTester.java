package problem;

import org.junit.jupiter.api.Test;
import problem.object.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class BSTIteratorTester {

    @Test
    public void example1(){
        BSTIterator bSTIterator = new BSTIterator(new TreeNode<>(7, 3, 15, null, null, 9, 20));

        assertEquals(3, bSTIterator.next());    // return 3
        assertEquals(7, bSTIterator.next());    // return 7
        assertTrue(bSTIterator.hasNext());               // return True
        assertEquals(9, bSTIterator.next());    // return 9
        assertTrue(bSTIterator.hasNext());               // return True
        assertEquals(15, bSTIterator.next());   // return 15
        assertTrue(bSTIterator.hasNext());               // return True
        assertEquals(20, bSTIterator.next());   // return 20
        assertFalse(bSTIterator.hasNext());              // return False
    }
}
