import java.util.LinkedList;
import java.util.Scanner;

public class CovidVictimApp
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);//system input
        
        CovidVictim cV = new CovidVictim();//to do new object for class CovidVictim
        LinkList victimLL=new LinkList();//create array with default array
        // to input 5 victim
        for (int i=0; i<5; i++)
        {
            System.out.println("---------------------------------------*                                  *------------------------------------------");
            System.out.println("Information Of Victim: ");
            System.out.println("Enter Victim Name : ");
            String victimName=input.next();
            System.out.println("Enter Your Case ID: ");
            String caseId=input.next();
            System.out.println("Enter Your Age");
            int age=input.nextInt();
            System.out.println("Enter Your Cluster Name :");
            String clusterName=input.next();
            System.out.println("Enter Positive Date ");
            String positiveDate=input.next();
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            
            cV=new CovidVictim(victimName, caseId, age, clusterName, positiveDate);//to call class CovidVictim
            victimLL.insertAtFront(cV);
        }
        
        Object data=victimLL.getFirst();
        while(data != null)
        {
            cV=(CovidVictim)data;
            int month = Integer.parseInt(cV.getPositiveDate().substring(2,4)); 
            
            if(month>9)
            {
                System.out.println("Victim's That Positive Date At Fourth Quarter Year : ");
                cV.displayVictim();  
            }
            
            data = victimLL.getNext();
        }
        
        data=victimLL.getFirst();
        LinkList riskVictimLL =new LinkList();
        LinkList temp= new LinkList();
        System.out.println("\nList Risk Victim Covid That Age Above 50 Years : ");
        
        while(data != null)
        {
            cV=(CovidVictim)data;
            if(cV.getAge() > 50)
            {
                cV.displayVictim();
                
                riskVictimLL.insertAtFront(cV);
                victimLL.deleteNode(cV);
            }
            else
            {
                temp.insertAtFront(cV);
            }
            data = victimLL.getNext();
        }
        
        data=temp.getFirst();
        System.out.println("\nList Current Victim Covid That Not Above 50 Years: ");
        while(data != null)
        {
            cV=(CovidVictim)data;
            cV.displayVictim();
            
            victimLL.insertAtFront(cV);
            data = temp.getNext();
        }
        
        data=riskVictimLL.getFirst();
        int noVictim=0;
        System.out.println("\t\t\t\nTOTAL VICTIMS FOR EACH CLUSTER  ");
        while(data != null)
        {
            cV=(CovidVictim)data;
            
            noVictim++;
            
            System.out.println("\t\t CLUSTER \t\t No. of Victims ");
            System.out.println("\t\t "+cV.getClusterName()+"\t\t\t\t"+noVictim);
            
            data=riskVictimLL.getNext();
        }
    } // main
} // CovidApp