class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class LL {
    Node head;

    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head.next = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteNode(int key) {
        if(head != null && head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        
    }

    public void printNodes() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public boolean searchNode(int key) {
        if(head == null) {
            return false;
        }

        Node temp = head;

        while(temp.next != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtHead(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.printNodes();
        System.out.println();

        list.deleteNode(10);

        list.printNodes();

        System.out.println(list.searchNode(20));
    }
}
