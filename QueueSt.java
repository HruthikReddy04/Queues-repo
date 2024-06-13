package Queues;

import java.util.*;

public class QueueSt {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void add(int val) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(val);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();

        }

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
