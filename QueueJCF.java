
package Queues;

import java.util.*;

public class QueueJCF {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
    }

}
