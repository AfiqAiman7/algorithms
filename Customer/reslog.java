import java.util.*;
import java.io.*;

public class reslog
{
    public static void main(String[]args)
    {
        try
        {
            FileReader reader=new FileReader("residenceData.txt.txt");
            BufferedReader in=new BufferedReader(reader);
            
            FileWriter fw1=new FileWriter("resKelantan.txt.txt");
            BufferedWriter bw1=new BufferedWriter(fw1);
            PrintWriter out1=new PrintWriter(bw1);
            
            FileWriter fw2=new FileWriter("totalResIncome.txt.txt");
            BufferedWriter bw2=new BufferedWriter(fw2);
            PrintWriter out2=new PrintWriter(bw2);
            
            int id;
            char race;
            int numChild;
            double income;
            double Malaytotal=0;
            double Chinesetotal=0;
            double Indiantotal=0;
            String state;
            String data=null;
            StringTokenizer input=null;

            while((data=in.readLine())!=null)
            {
                input=new StringTokenizer(data,";");
                id=Integer.parseInt(input.nextToken());
                race=input.nextToken().charAt(0);
                numChild=Integer.parseInt(input.nextToken());
                income=Double.parseDouble(input.nextToken());
                state=input.nextToken();
                    
                residence res=new residence(id, race, numChild, income, state);
                if(res.getState().equalsIgnoreCase("Kelantan"))
                {
                    out1.println(res.toString());
                }
                
                if(res.getRace()=='M')
                {
                    Malaytotal=Malaytotal+res.getIncome();
                }
                else if(res.getRace()=='C')
                {
                    Chinesetotal=Chinesetotal+res.getIncome();
                }
                else if(res.getRace()=='I')
                {
                    Indiantotal=Indiantotal+res.getIncome();
                }
                out2.println("Total income for Malay :RM"+Malaytotal);
                out2.println("Total income for Chinese :RM"+Chinesetotal);
                out2.println("Total income for Indian :RM"+Indiantotal);
                
                System.out.println(res.toString());
                in.close();
                out1.close();
                out2.close();
            }
        }
        
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
    }
}