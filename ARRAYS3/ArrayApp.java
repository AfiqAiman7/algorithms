import java.io.*;
import java.util.*;
import javax.swing.*;

public class ArrayApp
{
    public static void main(String[] args) 
    {
        int[] id = new int[3];
        String[] name = new String[3];
        int[] Mark = new int[3];
 
        System.out.println("Insert 3 students id and name"); //
     	     
        for(int i=0; i<3; i++)
	{
            id[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter id :"));
            name[i] = JOptionPane.showInputDialog("Enter name :");
    	}
        Mark[0] = 78;
	Mark[1] = 98;
	Mark[2] = 67;
 
	for(int i=0; i<3; i++)// to display data in array
    	{  
    	    System.out.println("id :"+id[i]);
            System.out.println("Name :"+name[i]);
            System.out.println("Mark :"+Mark[i]);
            System.out.println();
	}
    }
}
    