import javax.swing.*;

public class studentApp
{
    public static void main(String[] args)
    {
        Student[] stdObject = new Student[3];
        System.out.println("Insert 3 students id, name and mark");
         for(int i=0; i<3; i++)
    {
        String sId= JOptionPane.showInputDialog("Enter id :");
            String sName= JOptionPane.showInputDialog("Enter name :");
            String sMark = JOptionPane.showInputDialog("Enter mark :");
            int isID = Integer.parseInt(sId);
            int isMark = Integer.parseInt(sMark);
        
            stdObject[i] = new Student(isID, sName, isMark);
 
    }
 
        for(int i=0; i<3; i++)
    {  
            System.out.println(stdObject[i].toString());
    }
    }
}
