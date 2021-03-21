package treeDSA;/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 21-03-2021
 *   Time: 05:50 PM
 *   File: treeDSA.Tree.java
 */

import java.util.Scanner;

public class Tree {

    public Node createTree() {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public void inOrder(Node root) {
        //LNR
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public void preOrder(Node root) {
        //NLR
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postorder(Node root) {
        //LRN
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }
}