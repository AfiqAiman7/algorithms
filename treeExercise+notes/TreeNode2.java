public class TreeNode2
{
    public student data;
    public TreeNode2 left;
    public TreeNode2 right;
    /**
    * create a leaf node
    */
    public TreeNode2(student d)
    {
        data = d;
        left = right = null;
    }
    // * insert a node at an appropriate place */
    public void insert(student d)
    {
        if(d.getID()<data.getID())
        {
            if (left == null)
                left = new TreeNode2(d);
            else
                left.insert(d);
        }
        else if(d.getID()>=data.getID())
        {
            if(right == null)
                right = new TreeNode2(d);
            else
                right.insert(d);
        }
    }
}