import java.util.ArrayList;
import java.util.Scanner;

public class ArrayApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Bicycle b = new Bicycle();
        ArrayList<Bicycle> bicycleAL=new ArrayList(50);
            
        for (int i=0; i<50; i++)//array
        {
            System.out.println("Enter Your Brand : ");
            String brand=input.next();
            System.out.println("Enter Your Type: ");
            String type=input.next();
            System.out.println("Enter Your Price : RM");
            double price=input.nextDouble();
            System.out.println("Enter Your Materials : ");
            char material=input.next().charAt(0);
                
            b=new Bicycle(brand, type, price, material);
            bicycleAL.add(b);
        }
        
        for(int i=0; i<bicycleAL.size(); i++)
        {
            b=(Bicycle)bicycleAL.get(i);
            System.out.println(b.toString());
        }
        
        int countM=0;
        for(int i=0; i<bicycleAL.size(); i++)
        {
            b=(Bicycle)bicycleAL.get(i);
            if(b.getType().equalsIgnoreCase("folding"))
                if(b.getMaterial()=='B')
                    countM++;
        }
        System.out.println("The number of steel folding : "+countM);
        
        System.out.println("\nNew SteelAL, AlumniniumAL and CarbonAL");
        ArrayList<Bicycle> SteelAL=new ArrayList();
        ArrayList<Bicycle> AluminiumAL=new ArrayList();
        ArrayList<Bicycle> CarbonAL=new ArrayList();
        for(int i=0; i<bicycleAL.size();i++)
        {
            b=(Bicycle)bicycleAL.get(i);
            if(b.getMaterial ()=='A')
            {
                SteelAL.add(b);
            }
            else if(b.getMaterial ()=='B')
            {
                AluminiumAL.add(b);
            }
            else if(b.getMaterial ()=='C')
            {
                CarbonAL.add(b);
            }
            bicycleAL.remove(i);
            i--;
        }
        
        int totalOrder=0;
        for(int i=0; i<SteelAL.size();i++)
        {
            b=(Bicycle)SteelAL.get(i);
            if(b.getPrice()>300)
            {
                totalOrder++;
                System.out.println("Total Numbers Of Orders Above RM30 :"+b.toString());
            }
        }
        System.out.println("The Numbers Of Orders Above RM30 :"+totalOrder);
    }
}