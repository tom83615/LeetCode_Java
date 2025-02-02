package problem;

import org.junit.jupiter.api.Test;
import problem.object.NestedInteger;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlattenNestedListIteratorTester {

    @Test
    public void example1(){
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedInteger(1,1));
        nestedList.add(new NestedInteger(2));
        nestedList.add(new NestedInteger(1,1));

        int[] except = {1,1,2,1,1};
        int i = 0;

        FlattenNestedListIterator flattenNestedListIterator = new FlattenNestedListIterator(nestedList);

        while (flattenNestedListIterator.hasNext()){
            assertEquals( except[i], flattenNestedListIterator.next());
        }
    }

    @Test
    public void example2(){
        NestedInteger nestedInteger6 = new NestedInteger(6);
        NestedInteger nestedInteger4 = new NestedInteger(6);
        NestedInteger nestedInteger1 = new NestedInteger(6);

        nestedInteger4.add(nestedInteger6);
        nestedInteger1.add(nestedInteger4);

        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(nestedInteger1);

        int[] except = {1,4,6};
        int i = 0;

        FlattenNestedListIterator flattenNestedListIterator = new FlattenNestedListIterator(nestedList);

        while (flattenNestedListIterator.hasNext()){
            assertEquals( except[i], flattenNestedListIterator.next());
        }
    }
}
