import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;

public class StackApp
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        Car cars = new Car();
        Stack A = new Stack();
        // to input 7 toys into the list
        for (int i=0; i<3; i++)
        {
            System.out.println("Enter Brand : ");
            String brand=input.next();
            System.out.println("Enter Chassis Number : ");
            String chassisNum=input.next();

            cars = new Car(brand, chassisNum);
            A.push(cars);
        }
        
        Stack B=new Stack();
        Stack C= new Stack();
        Stack T=new Stack();
        Object data=null;
        while(!A.isEmpty())
        {
            data=A.pop();
            cars=(Car)data;
            if(cars.getBrand().equalsIgnoreCase("BMW"))
            {
                B.push(cars);
            }
            else
            if(cars.getBrand().equalsIgnoreCase("Mercedes Benz"))
            {
                C.push(cars);
            }
            else
            {
                T.push(cars);
            }
        }
        
        System.out.println("Enter buyer :");
        String buyer=input.next();
        if(buyer.equalsIgnoreCase("BMW"))
        {
            B.peek();
            B.pop();
        }
        else if(buyer.equalsIgnoreCase("Mercedes Benz"))
        {
            C.peek();
            C.pop();
        }
        else if(buyer.equalsIgnoreCase(""))
        {
            T.peek();
            T.pop();
        }
        else
            System.out.println("The car that you want is not available, sorry!!!");
        
    } // main
} // StackApp