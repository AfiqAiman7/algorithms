public class TreeApp
{
    public static void main(String [] args)
    {
        BSTree theTree = new BSTree();
        theTree.insertNode("nangka");
        theTree.insertNode(7);
        theTree.insertNode(8);
        theTree.insertNode(5);
        theTree.insertNode(3);
        theTree.insertNode(5);
        System.out.println("\nPreOrder Traversal :");
        theTree.preOrderTraversal();
        System.out.println("\nInOrder Traversal :");
        theTree.inOrderTraversal();
        System.out.println("\nPostOrder Traversal :");
        theTree.postOrderTraversal();
    }
}