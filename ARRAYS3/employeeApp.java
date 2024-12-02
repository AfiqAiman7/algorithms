import java.util.ArrayList;
import javax.swing.JOptionPane;

 public class employeeApp
{
    public static void main(String [] args)
    {   
            Employee E = new  Employee();
            ArrayList<Employee> List = new ArrayList();
        
            // to input 5 empoyees
            for (int i=0; i<5; i++)
            {
            
                String eID = JOptionPane.showInputDialog("Enter employee id");
                                                     
                int epmID = Integer.parseInt(eID);
                String eName = JOptionPane.showInputDialog("Enter name");
                String eDepart = JOptionPane.showInputDialog("Enter department");           
                String ePos= JOptionPane.showInputDialog("Enter position");
                String ePerformance = JOptionPane.showInputDialog("Enter performance");
                                                       
                double ePerform = Double.parseDouble(ePerformance);

                E = new Employee(epmID, eName, eDepart, ePos, ePerform);
                List.add( E);
            }        
        
            // to display all the employee
            for (int i=0; i<List.size(); i++)
            {
                E = (Employee)List.get(i);
                System.out.println(E.toString());
            }
        
            // to find the best performance of Employee
            // to count the number of employees in IT department 
            // to count the number of employees who performance is 80 and 
            //above
            int counterIT = 0, counter80 = 0, indMax = 0;
            double maxPerform = 0.0;
            for (int i=0; i<List.size(); i++)
            {
                E = (Employee)List.get(i);
                if (E.getPerformance() > maxPerform)
                {   
                    maxPerform = E.getPerformance();
                    indMax = i;
                }
                if (E.getDepart().equalsIgnoreCase("IT"))
                    counterIT++;
                if (E.getPerformance() >= 80)
                    counter80++;    
            }
        
            System.out.println("\tThe best employee is :");
            E=(Employee) List.get(indMax);
            System.out.println(E.toString());
            System.out.println("\tThere are " + counterIT + "temployee(s) of IT Department");                                       
            System.out.println("\tThere are " + counter80 + " employee(s) whose get the 80 and above of the performance");
            
            for (int i=0; i<List.size(); i++)
            {
                 E = (Employee)List.get(i);
                 if(E.getDepart().equalsIgnoreCase("HR"))
                 {
                    List.remove(i);
                    i--;
                 }
            }
   } // main
}  // EmployeeApp