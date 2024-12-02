import java.io.*;
import java.util.*;

public class customerTextFile
{
    public static void main(String[]args)throws IOException
    {
        try
        {
            //Step1:Create input stream object 
            FileReader reader=new FileReader("custData.txt");
            //Step2:Create buffered stream object 
            BufferedReader in=new BufferedReader(reader);

            String data=null;
            String custName,custTel,orderMenu;
            int orderUnit;
            double totPrice,price;
            StringTokenizer input=null;
            //Step3:Create looping to read each line from input file. 
            while((data=in.readLine())!=null)
            {
                input= new StringTokenizer(data,"#");
                custName=input.nextToken(); 
                custTel=input.nextToken();
                orderMenu=input.nextToken();
                orderUnit=Integer.parseInt(input.nextToken());
                
                customer cust=new customer(custName,custTel,orderMenu,orderUnit);
                if(cust.getOrderMenu().equalsIgnoreCase("salmon"))
                {
                    price=60.00;
                }
                else if(cust.getOrderMenu().equalsIgnoreCase("calamari"))
                {
                    price=30.00;
                }
                else
                {
                    price=20.00;
                }
                totPrice=price*cust.getOrderUnit();
                //Display customer information 
                System.out.println(cust.toString());
                System.out.println("TotalPrice:"+totPrice);
                System.out.println("===========================");
            }//end while 
            //Step4:Close the buffered Reader
            in.close();
        }//end try 
        catch(FileNotFoundException fnf)
        {
            System.out.println(fnf.getMessage());
        }
        catch(EOFException eof)
        {
            System.out.println(eof.getMessage());
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
        finally
        {
            System.out.println("Systemendhere..TQ!!");
        }
    }//end main}
}//end class