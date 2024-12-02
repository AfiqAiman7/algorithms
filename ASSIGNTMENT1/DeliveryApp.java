import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryApp
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);//system input
        
        Delivery D = new Delivery();//to do new object for class delivery
        ArrayList<Delivery> deliAL=new ArrayList();//create array with default array
        
        for (int i=0; i<6; i++)//array
        {
            System.out.println("Enter Your Type: ");
            String type=input.next();
            System.out.println("Enter Your Area : ");
            String area=input.next();
            System.out.println("Enter Your Order : RM");
            double order=input.nextDouble();
            System.out.println("Enter Your Delivery Distance In KM :");
            double distance=input.nextDouble();
            System.out.println("Enter Your Delivery Charge : RM");
            double charge=input.nextDouble();
            
            D=new Delivery(type, area, order, distance, charge);//to call class delivery
            deliAL.add(D);//add class delivery on object
        }
        
        for(int i=0; i<deliAL.size(); i++)//returns the number of elements in Array deliAL
        {
            D=(Delivery)deliAL.get(i);//getter for object 
            System.out.println(D.toString());//display all
        }
        
        String area=input.next();//to know whether that area are found or not
        boolean found=false;
        for(int i=0; i<deliAL.size(); i++)
        {
            D=(Delivery)deliAL.get(i);
            if(D.getArea().equalsIgnoreCase(area))
            {
                found=true;
                System.out.println("\nThe Area Is : "+D.toString());
            }
        }
        
        if(found=false)
            System.out.println("\nArea Not Found!!!");
        
        int totalOrder=0;
        for(int i=0; i<deliAL.size();i++)
        {
            D=(Delivery)deliAL.get(i);
            if(D.getOrder()>=30.00)//if order more or equal RM30
            {
                totalOrder++;
                System.out.println("Total Numbers Of Orders Above RM30 :"+D.toString());
            }
        }
        System.out.println("The Numbers Of Orders Above RM30 :"+totalOrder);//total numbers of orders
        
        System.out.println("\nNew Food Panda Services : FoodPanda/ GrabFood/ OthersFood");
        ArrayList<Delivery> PandaAL=new ArrayList();//PandaAL new arraylist with default capacity/constructor
        ArrayList<Delivery> GrabAL=new ArrayList();
        ArrayList<Delivery> OtherAL=new ArrayList();
        for(int i=0; i<deliAL.size();i++)
        {
            D=(Delivery)deliAL.get(i);
            if(D.getType().equalsIgnoreCase("FoodPanda"))
            {
                PandaAL.add(D);
            }
            else if(D.getType().equalsIgnoreCase("GrabFood"))
            {
                GrabAL.add(D);
            }
            else 
            {
                OtherAL.add(D);
            }
            deliAL.remove(i);
            i--;
        }
        
        for(int i=0; i<PandaAL.size();i++)
        {
            D=(Delivery)PandaAL.get(i);
            System.out.println("\nDisplaying FoodPanda Services Information");
            System.out.println(D.toString());
        }
        
        for(int i=0; i<GrabAL.size();i++)
        {
            D=(Delivery)GrabAL.get(i);
            System.out.println("\nDisplaying GrabFood Services Information");
            System.out.println(D.toString());
        }
        
        for(int i=0; i<OtherAL.size();i++)
        {
            D=(Delivery)OtherAL.get(i);
            System.out.println("\nDisplaying OthersFood Services Information");
            System.out.println(D.toString());
        }
        
        double MarangTotal=0;
        for(int i=0; i<PandaAL.size();i++)
        {
            D=(Delivery)PandaAL.get(i);
            if(D.getArea().equalsIgnoreCase("Marang"))
            {
                MarangTotal=MarangTotal+D.totalCharge();
            }
        }
        System.out.println("\nTotal Amount Of FoodPanda Services In Marang : RM"+MarangTotal);
        
        double newcharge=5;
        for(int i=0; i<OtherAL.size(); i++)
        {
            D=(Delivery)OtherAL.get(i);
            if(D.getArea().equalsIgnoreCase("KualaTerengganu"))
            {
                System.out.println("\nInformations Others Services before Changes"+D.toString());
                System.out.println("Delivery Charges Of Others Types In Kuala Terengganu Is Up to RM5");
                D.setCharge(newcharge);
                System.out.println("Informations Others Services after Changes"+D.toString());
            }
        }
    }
}
