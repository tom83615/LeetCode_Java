package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ImplementStackUsingQueuesTester {

    @Test
    public void example1(){
        ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.top()); // return 2
        assertEquals(2,myStack.pop(), myStack.top()); // return 2
        assertFalse(myStack.empty()); // return False
    }
}
