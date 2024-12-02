public class BSTree
{
    private TreeNode root;
    // * Construct an empty tree */
    public BSTree()
    {
        root = null;
    }
    /* insert a new node into BST if the tree is empty, create root here
    * otherwise call the insert method to insert a node */
    public void insertNode(int d)
    {
        if(root == null)
            root = new TreeNode(d);
        else
            root.insert(d);
    }
    public void preOrderTraversal()
    {
        preOrderHelper(root);
    }
    private void preOrderHelper(TreeNode node)
    {
        if(node==null)
            return;
        System.out.print(node.data +" ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }
    public void inOrderTraversal()
    {
        inOrderHelper(root);
    }
    private void inOrderHelper(TreeNode node)
    {
        if(node==null)
            return;
        inOrderHelper(node.left);
        System.out.print(node.data +" ");
        inOrderHelper(node.right);
    }
    
    public void postOrderTraversal()
    {
        postOrderHelper(root);
    }
    private void postOrderHelper(TreeNode node)
    {
        if(node==null)
            return;
        postOrderHelper(node.left);
        postOrderHelper(node.right);
        System.out.print(node.data +" ");
    }
}