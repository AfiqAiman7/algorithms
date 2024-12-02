public class Employee
{
    private String eID;
    private String eName;
    private int eAge;
    private double eSalary;
    
    public Employee()
    {
        eID="";
        eName="";
        eAge=-1;
        eSalary=-1;
    }
    public Employee(String eID, String eName, int eAge, double eSalary)
    {
        this.eID= eID;
        this.eName= eName;
        this.eAge=eAge;
        this.eSalary=eSalary;
    }
    public void setEmployee(String eID, String eName, int eAge, double eSalary)
    {
        eID= eID;
        eName= eName;
        eAge=eAge;
        eSalary=eSalary;
    }
    public String getID()
    {
        return eID;
    }
    public String getName()
    {
        return eName;
    }
    
    public int getAge()
    {
        return eAge;
    }
    public double getSalary()
    {
        return eSalary;
    }

    public String toString()
    {
        return("ID : "+eID + "Name : " +eName + "Age :"+eAge + "Salary : "+eSalary);
    }
}
