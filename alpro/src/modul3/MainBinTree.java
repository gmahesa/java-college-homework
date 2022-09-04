package modul3;
public class MainBinTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        TreeNode node = new TreeNode(5);
        tree.insert(node);

        TreeNode node1 = new TreeNode(3);
        tree.insert(node1);

        TreeNode node2 = new TreeNode(2);
        tree.insert(node2);

        System.out.print("Traversal dengan metode preorder : ");
        tree.preOrder();
        
    }
}





























/*
System.out.print("\nTraversal dengan inorder :");
tree.inOrder();
System.out.print("\nTraversal dengan postorder :");
tree.postOrder();
System.out.println();
*/