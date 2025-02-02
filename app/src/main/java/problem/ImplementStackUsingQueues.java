package problem;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.remove());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.size() == 0;
    }
}
