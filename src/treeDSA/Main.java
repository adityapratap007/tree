package treeDSA;
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node values = tree.createTree();

        tree.inOrder(values);
        System.out.println();
        tree.preOrder(values);
        System.out.println();
        tree.postorder(values);
        System.out.println();
    }
}
