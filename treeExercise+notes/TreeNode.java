public class TreeNode
{
    public int data;
    public TreeNode left;
    public TreeNode right;
    /**
    * create a leaf node
    */
    public TreeNode(int d)
    {
        data = d;
        left = right = null;
    }
    // * insert a node at an appropriate place */
    public void insert(int d)
    {
        if(d<data)
        {
            if (left == null)
                left = new TreeNode(d);
            else
                left.insert(d);
        }
        else if(d>=data)
        {
            if(right == null)
                right = new TreeNode(d);
            else
                right.insert(d);
        }
    }
}