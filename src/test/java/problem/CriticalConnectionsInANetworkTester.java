package problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriticalConnectionsInANetworkTester {
    CriticalConnectionsInANetwork criticalConnectionsInANetwork = new CriticalConnectionsInANetwork();

    @Test
    public void example1(){
        int n=4;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.stream(new int[]{0,1}).boxed().collect(Collectors.toUnmodifiableList()));
        connections.add(Arrays.stream(new int[]{1,2}).boxed().collect(Collectors.toUnmodifiableList()));
        connections.add(Arrays.stream(new int[]{2,0}).boxed().collect(Collectors.toUnmodifiableList()));
        connections.add(Arrays.stream(new int[]{1,3}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{1,3}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = criticalConnectionsInANetwork.criticalConnections(n, connections);
        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int n=2;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.stream(new int[]{0,1}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{0,1}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = criticalConnectionsInANetwork.criticalConnections(n, connections);
        assertEquals(except, actual);
    }
}
