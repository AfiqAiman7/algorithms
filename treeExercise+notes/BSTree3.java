public class BSTree3
{
    private TreeNode2 root;
    /* Construct an empty tree */
    public BSTree3()
    {
        root = null;
    }
    // insert a new node into BST if the tree is empty, create root
    // here otherwise call the insert method to insert a node
    public void insertNode(student d)
    {
        if(root == null)
            root = new TreeNode2(d);
        else
            root.insert(d);
    }
    //inOrder Traversal
    public void inOrderTraversal()
    {
        inOrderHelper(root);
    }
    //recursive method to perform inOrderTraversal
    private void inOrderHelper(TreeNode2 node)
    {
        if(node==null)
            return;
        inOrderHelper(node.left);
        System.out.print("Student ID : "+node.data.getID());
        System.out.print("Student name : "+node.data.getName());
        System.out.print("Student Part : "+node.data.getPart());
        System.out.print("Student CGPA : "+node.data.getCgpa());
        inOrderHelper(node.right);
    }
    //to count all node or all student in the tree
    public int countNodeAll()
    {
        return countNode(root);
    }
    //recursive method to count all nodes or students with no
    //condition
    private int countNode(TreeNode2 node)
    {
        if(node==null)
            return 0;
        return 1 + countNode(node.left) + countNode(node.right);
    }
    //to count all dean list
    public int countAllDL()
    {
        return countDL(root);
    }
    //recursive method to count all dean list student with cgpa > 3.5
    private int countDL(TreeNode2 node)
    {
        if(node==null)
            return 0;
        if(node.data.getCgpa() > 3.5)
            return 1 + countDL(node.left) + countDL(node.right);
        else
            return countDL(node.left) + countDL(node.right);
    }
    //count all part N student
    public int countPartN(int n)
    {
        return countPart(root,n);
    }
    //recursive method to count all student where part is equal to n
    private int countPart(TreeNode2 node, int n)
    {
        if(node==null)
            return 0;
        if(node.data.getPart() == n)
            return 1 + countPart(node.left,n) + countPart(node.right,n);
        else
            return countPart(node.left,n) + countPart(node.right,n);
    }
    //display all data
    public void displayAll()
    {
        display(root);
    }
    //recursive method to display all data using inorder traversal
    private void display(TreeNode2 node)
    {
        if(node==null)
            return;
        display(node.left);
        System.out.println(node.data + " ");
        display(node.right);
    }
    //calculate average cgpa
    public double calcAverage()
    {
        return calcSumCgpa(root)/countNode(root);
    }
    //recursive method to calculate the sum of cgpa
    public double calcSumCgpa(TreeNode2 node)
    {
        if(node==null)
            return 0;
        return node.data.getCgpa() + calcSumCgpa(node.left) +
        calcSumCgpa(node.right);
    }
}