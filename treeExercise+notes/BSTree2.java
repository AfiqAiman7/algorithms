public class BSTree2
{
    private TreeNode root;
    /**
    * Construct an empty tree
    */
    public BSTree2()
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
    public int countNodeAll()
    {
        return countNode(root);
    }
    private int countNode(TreeNode node)
    {
        if(node==null)
            return 0;
        return 1 + countNode(node.left) + countNode(node.right);
    }
    public int calcSumAll()
    {
        return calcSum(root);
    }
    private int calcSum(TreeNode node)
    {
        if(node==null)
            return 0;
        return node.data + countNode(node.left) + countNode(node.right);
    }
    public int countEvenAll()
    {
        return countEven(root);
    }
    private int countEven(TreeNode node)
    {
        if(node==null)
            return 0;
        if(node.data % 2 ==0)
            return 1 + countEven(node.left) + countEven(node.right);
        else
            return countEven(node.left) + countEven(node.right);
    }
    public void displayMultipleAll(int n)
    {
        displayMultiple(root,n);
    }
    private void displayMultiple(TreeNode node, int n)
    {
        if(node==null)
            return;
        displayMultiple(node.left, n);
        if(node.data % n ==0)
            System.out.println(node.data + " ");
        displayMultiple(node.right, n);
    }
}