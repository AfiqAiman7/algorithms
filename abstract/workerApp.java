import javax.swing.*; 
import java.util.Scanner;
public class workerApp
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Insert the number of workers:");
        int size=in.nextInt();
        Calculate and display the total of estimated price of all purchases on 22ndJuly.
        ChaletOwner[] co=new ChaletOwner[size];
        for(int i=0;i<co.length;i++)
        {
            System.out.print("Chalet Name:");
            String cname=in.next();
            System.out.print("Chalet ID:");
            String cID=in.next();
            System.out.println("Year open:");
            int yO=in.nextInt();
            System.out.println("Profit:");
            double pr=in.nextDouble();
            System.out.println("Malaysian Owner or NonMalaysian owner(M/N)?:");
            String ch=in.next();
            char choice=ch.charAt(0);
            if(choice=='M')
            {
                co[i]=new Malaysian(cname,cID,yO,pr);
            }
            else if(choice=='N')
            {
                System.out.println("Year Contract:");
                int yC=in.nextInt();
                co[i]=new NonMalaysian(cname,cID,yO,pr,yC);
            }
            else
                System.out.println("Wrongcode");
        }
        double maxTax=-99999.99;
        for(int i=0;i<co.length;i++)
        {
            if(co[i] instanceof Malaysian)
            {
                Malaysian ML=(Malaysian)co[i];
                if(ML.calcTax()>maxTax)
                maxTax=ML.calcTax();
            }
        }
        System.out.println("The maximum tax:"+maxTax);
        double totalTaxML=0.0, totalTaxNonML=0.0;
        double totalAllTax=0.0;
        for(int i=0;i<co.length;i++)
        {
            if(co[i] instanceof Malaysian)
            {
                Malaysian ML=(Malaysian)co[i];
                totalTaxML=totalTaxML+ML.calcTax();
            }
            if(co[i] instanceof NonMalaysian)
            {
                NonMalaysian NonML=(NonMalaysian)co[i];
                totalTaxNonML=totalTaxNonML+NonML.calcTax();
            }
        }//end for 
        totalAllTax=totalTaxML+totalTaxNonML;
        System.out.println("Chalet Total Tax");
        System.out.println("Malaysian owner:"+totalTaxML);
        System.out.println("Non Malaysian owner:"+totalTaxNonML);
        System.out.println("Total:"+totalAllTax);
        int numberNonML=0;
        for(int i=0;i<co.length;i++)
        {
            if(co[i]instanceof Malaysian)
            {
                NonMalaysian NonML=(NonMalaysian)co[i];
                System.out.println(NonML.toString());
                numberNonML++;
            }
        }
        System.out.println("The number of Non MalaysianOwner:"+numberNonML);
    }
}
            