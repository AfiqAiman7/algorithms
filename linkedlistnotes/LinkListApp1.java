public class LinkListApp1
{
    public static void main(String [] args)
    {
        // create an empty Linked List
        LinkList1 theList = new LinkList1();
        // add some data into the Linked List
        theList.insertAtBack("Mazlan");
        theList.insertAtBack("Anisah");
        theList.insertAtBack("Umar");
        theList.insertAtFront("Maryam");
        theList.insertAtFront("Ilman");
        // to display all the data in the Linked List
        Object data = theList.getFirst();
        while (data != null) 
        {
            System.out.print(data.toString() + " ");
            data = theList.getNext();
        }
    }
}