import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;

public class StackApp
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        Toys T = new Toys();
        Stack toyStack = new Stack();
        Stack tempStack = new Stack();
        // to input 7 toys into the list
        for (int i=0; i<7; i++)
        {
            System.out.println("Enter Toy Name : ");
            String toyName=input.next();
            System.out.println("Enter Brand : ");
            String brand=input.next();
            System.out.println("Enter Gender : ");
            char gender = input.next().charAt(0);
            System.out.println("Enter Category : ");
            String category = input.next();
            System.out.println("Enter Toy Type : ");
            String toyType = input.next();
            System.out.println("Enter Price : RM");
            double price = input.nextDouble();

            T = new Toys(toyName, brand, gender, category, toyType, price);
            toyStack.push(T);
        }
        // to display all the toys in the stack
        Object data;
        while (!toyStack.isEmpty())
        {
            data = toyStack.pop();
            T = (Toys) data;
            System.out.println(T.toString());
            tempStack.push(T); // put into temporary stack
        }
        // transfer all data from temporary stack into
        // original stack
        while (!tempStack.isEmpty())
        {
            data = tempStack.pop();
            T = (Toys) data;
            toyStack.push(T);
        }
        
        Stack educationStack = new Stack();
        Stack entertainmentStack = new Stack();
        while (!toyStack.isEmpty())
        {
            data = toyStack.pop();// pop from origional stack
            T = (Toys) data;
            if (T.getToyType().equalsIgnoreCase("education"))
            {
                System.out.println("Education Stack : ");
                System.out.println(T.toString());
                educationStack.push(T);
            }
        
            if (T.getToyType().equalsIgnoreCase("entertainment"))
            {
                System.out.println("Entertainment Stack : ");
                System.out.println(T.toString());
                entertainmentStack.push(T);
            }
        }

        double countInfant=0, countToddler=0, countPreschool=0;
        while (!educationStack.isEmpty())
        {
            data = educationStack.pop();// pop from origional stack
            T = (Toys) data;
            if (T.getCategory().equalsIgnoreCase("infant"))
                countInfant++;
            else if (T.getCategory().equalsIgnoreCase("toddler"))
                countToddler++;
            else if (T.getCategory().equalsIgnoreCase("preschool"))
                countPreschool++;
            
            tempStack.push(T);
        }
        System.out.println("\nThe Number Of Infant : " + countInfant);
        System.out.println("\nThe Number Of Toddler : " + countToddler);
        System.out.println("\nThe Number Of PreSchool : " + countPreschool);
        
        double maxToys=-99999.99;
        while (!tempStack.isEmpty())
        {
            data = tempStack.pop();// pop from origional stack
            T = (Toys) data;
            if (countInfant > countToddler & countInfant > countPreschool)
                maxToys = countInfant;
            else if(countToddler > countPreschool)
                maxToys = countToddler;
            else
                maxToys = countPreschool;
            
            System.out.println(T.toString());
            educationStack.push(T);
        }
        System.out.println("\nThe preferable toys is : " + maxToys);
        
        System.out.println("\nPlease enter your first letter : ");
        char searchLetter = input.next().charAt(0);
        boolean found=false;
        while (!entertainmentStack.isEmpty())
        {
            data = entertainmentStack.pop();// pop from origional stack
            T = (Toys) data;
            char letter = T.getToyName().charAt(0); 
            if (searchLetter==letter)
            {
                found=true;
                System.out.println("\n The letter that start with : "+letter+" : "+T.toString());
            }
            if(found=false)
                System.out.println("\n No letter that start with that "+letter+" = Not Found!!!");
            
            tempStack.push(T);
        }
        
    } // main
} // StackApp
