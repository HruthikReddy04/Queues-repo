package Queues;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head;
        Node tail;

        Queue() {
            head = null;
            tail = null;
        }

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        q.display();

    }

}
