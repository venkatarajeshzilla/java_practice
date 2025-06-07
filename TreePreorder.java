import java.util.*;

// Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    Node(int v) {
        data = v;
        left = right = null;
    }
}

// Binary Tree Class with Preorder Traversal
class BinaryTree {
    Node root;

    // Preorder Traversal Method
    public static void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");  
        printPreorder(node.left);          
        printPreorder(node.right);         
    }
}

public class TreePreorder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.print("Preorder Traversal: ");
        BinaryTree.printPreorder(tree.root);
    }
}
