import java.util.Scanner;

public class GoldApp
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner(System.in);
        
        Gold g= new Gold();//declare Object g of class Gold
        Queue goldQueue =new Queue();//declare object goldQueue of class Queue
        Queue tempQueue=new Queue();//declare object tempQueue of class Queue
        for(int i=0;i<5;i++)
        {
            System.out.println("\nEnter Series No : ");
            String seriesNo=input.next();
            System.out.println("Gold Brand : ");
            String goldBrand=input.next();
            System.out.println("Purity : ");
            int purity=input.nextInt();
            System.out.println("Gold Type : ");
            String goldType=input.next();
            System.out.println("Gold Price : ");
            double goldPrice= input.nextDouble();
            
            //insert all data into object named g through normal constructor
            g= new Gold(seriesNo, goldBrand, purity, goldType, goldPrice);
            //insert data from object g into object named goldQueue
            goldQueue.enqueue(g);
        }
        
        // to display all data of Gold
        while(!goldQueue.isEmpty())
        {
            g=(Gold)goldQueue.dequeue();//casting (data from goldQueue inserted into g)
            System.out.println(g.toString());
            tempQueue.enqueue(g);//data from g inserted into object named tempQueue
        }
        
        Object data=tempQueue.getFront();
        System.out.println("\nFirst Information Of Gold:"+data.toString());
        
        data=tempQueue.getEnd();
        System.out.println("\nLast Information Of Gold:"+data.toString());
        
        double price=0;
        double newPrice=0;
        while(!tempQueue.isEmpty())
        {
            g=(Gold)tempQueue.dequeue();
            if(g.getGoldBrand().equalsIgnoreCase("Makmur"))
            {
                if(g.getPurity()==22)
                {
                    System.out.println("\nPrice Before 10% :");
                    System.out.println(g.toString());
                    
                    price=g.getGoldPrice();
                    newPrice=price+(price*0.1);
                    g.setGoldPrice(newPrice);
                    
                    System.out.println("\nPrice After 10% :");
                    System.out.println(g.toString());
                }
            }
            goldQueue.enqueue(g);
        }
        
        System.out.println("\nInformation in goldQueue :");
        while(!goldQueue.isEmpty())//displaying all information in goldQueue
        {
            g=(Gold)goldQueue.dequeue();
            System.out.println(g.toString());
            tempQueue.enqueue(g);
        }
        
        Queue reserveQ=new Queue();
        System.out.println("\nEnter gold type that you want to remove :");
        String goldType=input.next();
        while(!tempQueue.isEmpty())
        {
            g=(Gold)tempQueue.dequeue();
            if (g.getGoldType().equalsIgnoreCase(goldType))
            {
                reserveQ.enqueue(g);
            }else
            {
                goldQueue.enqueue(g);
            }
        }
        
        while(!reserveQ.isEmpty())
        {
            g=(Gold)reserveQ.dequeue();
            System.out.println("\nReserve Queue :");
            System.out.println(g.toString());
        }
        
        while(!goldQueue.isEmpty())
        {
            g=(Gold)goldQueue.dequeue();
            System.out.println("\nGold Queue :");
            System.out.println(g.toString());
        }
    }
}