import java.security.acl.Owner;

// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node Owner
        Node Owner = new Node("Owner");
        // Create node DirectorOfMarketing
        Node DirectorOfMarketing = new Node("Director Of Marketing");
        // Create node ProjectManager
        Node Projectmanager = new Node("Project Manager");
        // Create node Employee
        Node Employee = new Node("Employee");
        // Create node Employee2
        Node Employee2 = new Node("Employee");
        // Create node Designer
        Node Designer = new Node("Designer");
        // Create node Programmer
        Node Programmer = new Node("Programmer");

        // Set left and right child of root node Owner
        Owner.left = DirectorOfMarketing;
        Owner.right = Projectmanager;

        // Set left and right child of node DirectorOfMarketing
        DirectorOfMarketing.left = Employee;
        DirectorOfMarketing.right = Employee2;

        // Set left and right child of node Projectmanager
        Projectmanager.left = Designer;
        Projectmanager.right = Programmer;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(Owner);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(Owner);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(Owner);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
