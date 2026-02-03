public class Experiment1 {
    public static class Stack {
        int maxSize;
        int top;
        int[] sArr;
        Stack(int size) {
            maxSize = size;
            sArr = new int[maxSize]; 
            top = -1;
        }
        public void push(int x) {
            if(top == maxSize - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            sArr[++top] = x;

        }
        public int pop() {
            if(top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return sArr[top--];
        }
        public int peek() {
            if(top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return sArr[top];
        }
        public boolean isEmpty() {
            return top == -1;
        }
        public void printAll() {
            for(int i = 0; i < sArr.length; i++) {
                System.out.print(sArr[i] + " ");
            }
            System.out.println();
        }
    }
    static class Queue {
        int front;
        int rear;
        int maxSize;
        int[] qArr;
        Queue(int size) {
            front = 0;
            rear = -1;
            maxSize = size;
            qArr = new int[maxSize];
        }

        public void enque(int x) {
            if(rear == maxSize - 1) {
                System.out.println("Queue is full");
                return;
            }
            qArr[++rear] = x;
        }

        public int dequeue() {
            if(front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return qArr[front++];
        }

        public int peek() {
            if(front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return qArr[front];
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public void printAll() {
            for(int i = 0; i < qArr.length; i++) {
                System.out.print(qArr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack: ");
        s.printAll();
        System.out.println("Peek: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Stack: ");
        s.printAll();

        Queue q = new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        System.out.println("Queue: ");
        q.printAll();
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Queue: ");
        q.printAll();
    }
}
