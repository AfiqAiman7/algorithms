import javax.swing.*;  
import java.util.ArrayList;
import java.util.Random;

public class ShoesApp
{
    public static void main(String [] args)
    {
        Shoes S = new Shoes();//declare Object E of class Employee
        Queue shoeQ = new Queue(); //declare object theQueue of class//Queue
        Queue tempQ = new Queue();
        // to input 5 empoyees
        for (int i=0; i<3; i++)
        {
            String type = JOptionPane.showInputDialog("Enter type");
            String style = JOptionPane.showInputDialog("Enter style");
            String sz= JOptionPane.showInputDialog("Enter size");
            int size = Integer.parseInt(sz);
            String p = JOptionPane.showInputDialog("Enter price");
            double price = Double.parseDouble(p);

            S = new Shoes(type, style, size, price);
            shoeQ.enqueue(S);
        }
        Queue formalQ = new Queue(); 
        Queue casualQ = new Queue();
        int countF=0;
        int countC=0;
        while(!shoeQ.isEmpty())
        {
            S = (Shoes)shoeQ.dequeue();
            if (S.getStyle().equalsIgnoreCase("formal"))
            {
                 formalQ.enqueue(S);
                 System.out.println(formalQ.toString());
                 countF++; 
            }
            if (S.getStyle().equalsIgnoreCase("casual"))
            {
                 casualQ.enqueue(S); 
                 System.out.println(casualQ.toString()); 
                 countC++;
            }
            tempQ.enqueue(S); 
        }

        
        Object x,y;
        while(!tempQ.isEmpty())
        {
            S = (Shoes)tempQ.dequeue();
            if(countF++>countC++)
            {
                System.out.println("There are more formal shoes than casual shoes" ); 
            }
            shoeQ.enqueue(S);
        }
        int max=0;
        while(!formalQ.isEmpty())
        {
            S=(Shoes)formalQ.dequeue();
            if(S.getSize()> max)
            {
                max=S.getSize();
            }
        }
        System.out.println("The biggest size in formal is "+ max);
    } // main
} // EmployeeApp    } // main