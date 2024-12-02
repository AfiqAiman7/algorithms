import java.io.*;
import java.util.*;

public class writingTextFile
{
    public static void main(String[]args)throws IOException
    {
        try
        {
            String studName,facName;
            int studID;
            
            Scanner sc=new Scanner(System.in);
            //Create output stream object 
            FileWriter fw=new FileWriter("studentData.txt");
            //Create buffered stream object of output file 
            BufferedWriter bw=new BufferedWriter(fw);
            //Create printwriter object of output file 
            PrintWriter pw=new PrintWriter(bw);
            
            for(int i=0;i<3;i++)
            {
                int total=i+1;
                System.out.println("Student"+total+"Information");
                System.out.println("Enterastudentname:");
                studName=sc.next(); 
                System.out.println("Enterastudentid:");
                studID=sc.nextInt();
                System.out.println("Enterafacultyname:");
                
                facName=sc.next();
                Student stud=new Student(studName,studID,facName);
                pw.println(stud.toString());
            }
            System.out.println("Your data have beens aved into text file");
            pw.close();
        }//endtry
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
    }//endmain}//endclass
}