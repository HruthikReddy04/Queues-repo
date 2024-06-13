package Queues;

public class CircularQueue {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            front = -1;
            rear = -1;
            arr = new int[n];
            size = n;

        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void display() {
            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return val;

        }

        public void add(int val) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;

            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = val;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(3);

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
