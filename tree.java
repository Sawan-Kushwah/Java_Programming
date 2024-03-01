import java.sql.SQLOutput;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        this.data = d;
        this.right = null;
        this.left = null;
    }
}

public class tree {
    public static Node buildTree(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data = sc.nextInt();
        root = new Node(data);

        //base case
        if(data == -1){
            return null;
        }

        System.out.println("enter the data for inserting in the left of " + data);
        root.left = buildTree(root.left);
        System.out.println("Enter the data for inserting in the right of " + data);
        root.right = buildTree(root.right);
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        return ;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        return;
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.right);
        postorder(root.left);
        System.out.print(root.data + " ");
        return;
    }

    public static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            s.push(temp);
            if(temp == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{

                System.out.print(temp.data + " ");
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        while(!s.isEmpty()){
            Node temp = s.pop();
            if (temp == null) {
                System.out.println();
            }else{
                System.out.print(temp.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting TREE");
//        Node root = new Node(3);
//        Node left = new Node(2);
//        Node right = new Node(6);
//        root.right = right;
//        root.left = left;
//        System.out.println(root.left.data);
        Node root = null;
        root = buildTree(root);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrderTraversal(root);

//                  1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1

    }
}
