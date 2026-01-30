public class BinaryTree {
    public class Node {
        int data;
        Node right;
        Node left;
        Node(int val) {
            data = val;
            left = right = null;
        }

        
    }
    private Node root;

    BinaryTree() {
        root = null;
    }

    void insert(Node node, int val) {
        if(node == null) {
            root = new Node(val);
            return;
        }

        if(node.left == null) {
            node.left = new Node(val);
        } else if(node.right == null) {
            node.right = new Node(val);
        } else {
            insert(node.left, val);
        }
    }
    void inorder(Node node) {
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void preorder(Node node) {
        if(node == null) return;
        System.out.print(node.data + " ");
        inorder(node.left);
        inorder(node.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 60);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
    }
}

