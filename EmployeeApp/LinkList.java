class LinkList
{ 
    private Node first; // reference to the first node in the list
    private Node current; // reference to the current node
    private Node last; // reference to the last node
    
    public LinkList()
    {
        first = null;
        last = null;
        current = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insertAtFront(Object insertItem)
    {
        Node newNode = new Node(insertItem);
        if (isEmpty())
        { 
            first = newNode;
            last = newNode;
        }
        else
        {
            newNode.next = first;
            first = newNode;
        }
    }
    public void insertAtBack(Object insertItem)
    {
        Node newNode = new Node(insertItem);
        if (isEmpty())
        { 
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        } 
    }
    public Object removeFromFront()
    {
        Object removeItem = null;
        if (isEmpty())
        {
            return removeItem;
        }
        
        removeItem = first.data;
        if ( first == last)
        {
            first = null;
            last = null;
        }
        else
            first = first.next;

        return removeItem;
    }
    public Object removeFromBack()
    {
        Object removeItem = null;
        if (isEmpty())
        {
            return removeItem;
        }
        removeItem = last.data;
        if ( first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            current = first;
            while (current.next != last)
            current = current.next;
            
            last = current;
            
            last.next = null;
        }
        return removeItem;
    }
    public Object getFirst()
    {
        if (isEmpty())
            return null;
        else
        {
            current = first;
            return current.data;
        }
    }
    public Object getNext()
    {
        if (current == last)
        return null;
        else
        {
            current = current.next;
            return current.data;
        }
    }
    Node InsertAtSecond(Node first, int data) 
    {
        Node newNode= new Node();
        newNode.data=data;
        Node temp;
        temp = first.next;
        first.next = newNode;
        newNode.next = temp;
    }
    Node InsertAtPosition(Node first, int data, int pos) 
    {
        Node newNode= new Node();
        newNode.data=data;
        Node ptr = first;
        pos = pos - 1;
        for (int i = 1; ; i++)
        {
            if(ptr==null)
            {
                break;
            }
            if (i == pos) 
            {
            newNode.next=ptr.next;
            ptr.next=newNode;
            break;
            }
            ptr = ptr.next;
        }
    }
    // Function to insert whole linked list in
        // to another linked list at position k
    static Node insert(Node theList1, Node theList2, int k)
    {
        // traverse the first linked list until k-th
        // point is reached
        int count = 1;
        Node curr = theList1;
        while (count < k) 
        {
            curr = curr.next;
            count++;
        }
        // backup next node of the k-th point
        Node temp = curr.next;
        // join second linked list at the kth point
        curr.next = theList2;
        // traverse the second linked list till end
        while (theList2.next != null)
            theList2 = theList2.next;
        // join the second part of the linked list
        // to the end
        theList2.next = temp;
        return theList1;
    }
}