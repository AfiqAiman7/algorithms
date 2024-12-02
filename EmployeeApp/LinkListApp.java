public class LinkListApp
{
    public static void main(String [] args)
    {
        // create an empty Linked List
        LinkList theList1 = new LinkList();
        LinkList theList2 = new LinkList();
        
        // add 5 datas into the Linked List using
        // insertAtBack
        theList1.insertAtBack("1");
        theList1.insertAtBack("2");
        theList1.insertAtBack("3");
        theList1.insertAtBack("4");
        theList1.insertAtBack("5");
        theList2.insertAtBack("9");
        theList2.insertAtBack("10");
        theList3.insertAtBack("11");
        theList4.insertAtBack("12");
        theList5.insertAtBack("13");
        
        int k = 2;
        printList(theList1); //assume class has a printList
        
        //method
        System.out.println();
        printList(theList2);
        theList1 = insert(theList1, theList2, k);
        System.out.print("\nResulting linked list\t");
        printList(theList1);
    }
}