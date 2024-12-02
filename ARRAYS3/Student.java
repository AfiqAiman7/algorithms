import javax.swing.*;
 
public class Student
{
    private int id;
    private String name;
    private int mark;
    
    public Student()
    {
        id = 0;
	name = "";
	mark=0;
    }
    
    public Student(int d, String n, int m)
    {
	id = d;
	name = n;
	mark=m;
    }
    
    public int getID()
    {	
        return id;
    }
    
    public String getName()
    {	
        return name;
    }
 
    public int getMark()
    {
        return mark;
    }
    
    public String toString()
    {
        return("Id : "+id+ "\nName : "+name+ "\nMark : "+mark);
    }
}
