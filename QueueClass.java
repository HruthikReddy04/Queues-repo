package Queues;

public class QueueClass {

    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int val) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = val;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }
    }

    static class QueueAlt {
        int arr[];
        int size;
        int rear;
        int front;

        QueueAlt(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 || front > rear;
        }

        public void add(int val) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }

            rear = rear + 1;
            arr[rear] = val;
        }

        public int remove() {
            int value;
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            } else if (front == rear) {
                value = arr[front];
                front = rear = -1;

            } else {
                value = arr[front];
                front = front + 1;
            }
            return value;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String args[]) {
        // QueueClass que = new QueueClass();
        QueueAlt q = new QueueAlt(5);
        q.add(4);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
