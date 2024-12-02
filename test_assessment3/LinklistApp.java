import java.util.Scanner;

public class LinklistApp
{
    public static void main(String arg[]) 
    {
     
        int num; 
        LinkList list = new LinkList(); 
        Scanner Scan = new Scanner (System.in);
        
        for (int i=0; i<= 5; i++) 
        { 
            num = Scan.nextInt();
            list.insertAtBack(num);
        } 
        
        int value = 13;
        Object data = list.getFirst(); 
        
        while (data!= null) 
        { 
            System.out.println("Number is :"+value);
            value = Integer.parseInt(data.toString()) ; 
            value = value/2; 
            
            if (value < 12) 
                list.insertAtFront(value); 
                
            data = list.getNext(); 
        } 
        
    }
}
