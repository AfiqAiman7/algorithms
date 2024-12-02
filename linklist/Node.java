public class Node
{
    Object data;
    Node next;
    
    Node(Object obj)
    { data = obj; }
}
    class LinkList
{
    :
    :
}
    public class LinkListApp
    {
        public static void main(String [] args)
        {
            // create an empty Linked List
            LinkList theList = new LinkList();
            // add some data into the Linked List
            theList.insertAtFront("Umar");
            theList.insertAtFront("Ilman");
            theList.insertAtFront("Maryam");
            // to display all the data in the Linked List
            Object data = theList.getFirst();
            while (data != null) 
            {
                System.out.print(data.toString() + " ");
                data = theList.getNext();
            }
        }
}