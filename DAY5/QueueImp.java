class Queue {
    int[] arr;
    int front, rear, size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int x) {
        if(rear == size - 1) {
            System.out.println("Queue is full!!");
            return;
        }
        arr[++rear] = x;
    }

    int dequeue() {
        if(front > rear) {
            System.out.println("Queue is empty!!");
        }
        return arr[front++];
    }

    
}

public class QueueImp {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

    }
}
