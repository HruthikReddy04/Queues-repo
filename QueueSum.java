package Queues;

import java.util.*;

public class QueueSum {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char c : str.toCharArray()) {
            q.add(c);
            freq[c - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1);
            } else {
                System.out.print(q.peek());
            }
        }
    }

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<Integer>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void QueueReversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String args[]) {
        // printNonRepeating("aabccxb");
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i < 11; i++) {
            q.add(i);
        }
        // interLeave(q);
        QueueReversal(q);
        System.out.println(q.toString());

    }
}
