import java.util.NoSuchElementException ;

public class Queue extends LinkList
{
    public Queue()
    { }
    public void enqueue(Object elem)
    { 
        insertAtBack(elem); 
    }
    public Object dequeue()
    { 
        return removeFromFront(); 
    }
    public Object getFront()
    { 
        return getFirst(); 
    }
    public Object getEnd()
    {
        Object obj = removeFromBack();
        insertAtBack(obj); //reinsert
        return obj;
    }
}