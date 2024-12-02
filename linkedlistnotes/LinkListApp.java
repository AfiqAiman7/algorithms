public class LinkListApp
{
    public static void main(String [] args)
    {
        // create an empty Linked List
        LinkList theList = new LinkList();
        
        // add 5 datas into the Linked List using
        // insertAtBack
        theList.insertAtBack("1");
        theList.insertAtBack("2");
        theList.insertAtBack("3");
        theList.insertAtBack("4");
        theList.insertAtBack("5");
        
        // to calculate the sum and the average of data in
        //the Linked List
        int sum = 0, count = 0;
        Object data = theList.getFirst();
        while (data != null)
        { 
            int no = Integer.parseInt(data.toString());
            sum = sum + no;
            count++;
            data = theList.getNext();
        } // while
        System.out.println("\nThe sum is : " + sum);
        System.out.println("The average is : " +sum/count);
        // to delete the first data
        data = theList.removeFromFront();
        if (data != null)
            System.out.println("DATA DELETED:"+ data.toString());
        else
            System.out.println("CANNOT DELETE - LIST EMPTY");
        // to delete the last data
        data = theList.removeFromBack();
        if (data != null)
            System.out.println("DATA DELETED : " + data.toString());
        else
            System.out.println("CANNOT DELETE - LIST EMPTY");
        // to display all the data left in the Linked List
        data = theList.getFirst();
        while (data != null) 
        {
            System.out.print(data.toString() + " ");
            data = theList.getNext();
        }
    }
}