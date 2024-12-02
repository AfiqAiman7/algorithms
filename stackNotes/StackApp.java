import javax.swing.*;  
import java.util.ArrayList;

public class StackApp
{
    public static void main(String [] args)
    {
        Employee E = new Employee();
        Stack theStack = new Stack();
        Stack tempStack = new Stack();
        // to input 5 employees into the list
        for (int i=0; i<5; i++)
        {
            String eId = JOptionPane.showInputDialog("Enter employee id");
            String eName = JOptionPane.showInputDialog("Enter Employee name");
            String eAge = JOptionPane.showInputDialog("Enter age");
            String eSalary = JOptionPane.showInputDialog("Enter cgpa");
            int age = Integer.parseInt(eAge);
            double salary = Double.parseDouble(eSalary);
            E = new Employee(eId, eName, eAge, eSalary);
            theStack.push(E);
        }
        // to display all the employees in the stack
        Object data;
        while (!theStack.isEmpty())
        {
            data = theStack.pop();
            E = (Employee) data;
            System.out.println(E.toString());
            tempStack.push(E); // put into temporary stack
        }
        // transfer all data from temporary stack into
        // original stack
        while (!tempStack.isEmpty())
        {
            data = tempStack.pop();
            E = (Employee) data;
            theStack.push(E);
        }
        
        int numAge = 0, num2000 = 0;
        while (!theStack.isEmpty())
        {
            data = theStack.pop();// pop from origional stack
            E = (Employee) data;
            if (E.getAge() > 40)
                numAge++;
        
            if(E.getSalary() >2000)
                num2000++;
                
            tempStack.push(E);
        }
        // display result
        System.out.println("The number of employee that their age is above 40 = " + numAge);
        System.out.println("The number of employe that salary > 2000 = " + num2000);
        
        double maxSalary = -99999.99, minSalary = 9999.99;
        while (!tempStack.isEmpty())
        {
            data = tempStack.pop();// pop from origional stack
            E = (Employee) data;
            if (E.getSalary() > maxSalary)
                maxSalary = E.getSalary();
            
            else
                minSalary = E.getSalary();
            
            theStack.push(E);
        }
        System.out.println("The maximum salary = " + maxSalary);
        System.out.println("The minimum salary = " + minSalary);
    } // main
} // StackApp