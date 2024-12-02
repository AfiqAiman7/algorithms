import javax.swing.*;

public class TreeApp3
{
    public static void main(String [] args)
    {
        BSTree3 theTree = new BSTree3();
        for(int i =0; i<5; i++)
        {
            int sID= Integer.parseInt(JOptionPane.showInputDialog("Enter student ID"));
            String name= JOptionPane.showInputDialog("Enter name");
            String sPart= JOptionPane.showInputDialog("Enter part");
            int iPart = Integer.parseInt(sPart);
            String sCGPA= JOptionPane.showInputDialog("Enter cgpa");
            double dcgpa = Double.parseDouble(sCGPA);
            student stud = new student(sID,name,iPart,dcgpa);
            theTree.insertNode(stud);
        }
        //to print all student
        System.out.println("InOrder Traversal :");
        theTree.inOrderTraversal();
        //to count all student
        int count = theTree.countNodeAll();
        System.out.println("\n\nThe number of students :" +count);
        //to count dean's list student
        int DL = theTree.countAllDL();
        System.out.println("\n\nThe number of DL student :" +DL);
        //to cakculate the average CGPA
        double ave = theTree.calcAverage();
        System.out.println("\n\nThe average CGPA :" +ave);
        //to count student of a particular part
        int iPart = Integer.parseInt(JOptionPane.showInputDialog("Which student do you want to count the part"));
        int no = theTree.countPartN(iPart);
        System.out.println("\n\nNumber of part" +iPart + " students :" +no);
    }
}
