public class MultiApp
{
     public static void main(String [] args)
     {
        Object data ;
        Queue queueNumber=new Queue();
        Queue tempqueue=new Queue();
        
        queueNumber.enqueue(7);
        queueNumber.enqueue(5);
        queueNumber.enqueue(2);
        queueNumber.enqueue(3);
        queueNumber.enqueue(4);
    
        System.out.println("DATA IN THE QUEUE : ");
        while (!queueNumber.isEmpty())
        {
            data = queueNumber.dequeue();
            System.out.println(data);
            tempqueue.enqueue(data);
        }
        
        Stack stackNumber = new Stack();
        Stack tempStack = new Stack();
        stackNumber.push(4);
        stackNumber.push(3);
        stackNumber.push(4);
        stackNumber.push(9);
        stackNumber.push(5);
        
        System.out.println("DATA IN THE STACK : ");
        while (!stackNumber.isEmpty()) 
        {
            data = stackNumber.pop();
            System.out.println(data);
            tempStack.push(data);
        }
        
        Queue qMulti= new Queue();
        Object x,y,z;
        System.out.println("queueNumber X stackNumber = queuemultiplication");
        while (!tempqueue.isEmpty() && !tempStack.isEmpty()) 
        {
            x=tempqueue.dequeue();
            int queueX=Integer.parseInt(x.toString());
            y=tempStack.pop();
            int stackY=Integer.parseInt(y.toString());
            int summulti = queueX * stackY;
            
            System.out.println(queueX + "\t\tX\t\t" + stackY + "\t\t=\t\t" + summulti);
    
            qMulti.enqueue(summulti);
            queueNumber.enqueue(x);
            tempStack.push(y);
        }
    }
}