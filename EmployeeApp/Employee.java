public class Employee
{
    private int employID;
    private String empName;
    private String empDepartment;
    private String empPosition; //manager,clerk,programmer,....
    private double empPerformance;
    
    public Employee()
    {
        employID=-1;
        empName="";
        empDepartment="";
        empPosition="";
        empPerformance=-1;
    }
    public Employee(int employID, String empName, String empDepartment, String empPosition, double empPerformance )
    {
        this.employID= employID;
        this.empName= empName;
        this.empDepartment= empDepartment;
        this.empPosition= empPosition;
        this.empPerformance= empPerformance;
    }
    public void setEmployee(int ID, String Name, String Department, String Position, double Performance )
    {
        employID= ID;
        empName= Name;
        empDepartment= Department;
        empPosition= Position;
        empPerformance= Performance;
    }
    public int getID()
    {
        return employID;
    }
    public String getName()
    {
        return empName;
    }
    
    public String getDepart()
    {
        return empDepartment;
    }
    public String getPos()
    {
        return empPosition;
    }
    public double getPerformance()
    {
        return empPerformance;
    }
    public String toString()
    {
        return("ID : "+employID + "Name : " +empName + "Department :"
        +empDepartment + "Postion : "+empPosition+
        "Performance :"+empPerformance);
    }
}