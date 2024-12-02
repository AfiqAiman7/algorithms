public class residence
{
    private int id;
    private char race;
    private int numChild;
    private double income;
    private String state;
    
    public residence(int i, char r, int n, double inc, String s)
    {
        id=i;
        race=r;
        numChild=n;
        income=inc;
        state=s;
    }
    
    public void setResidence(int i, char r, int n, double inc, String s)
    {
        id=i;
        race=r;
        numChild=n;
        income=inc;
        state=s;
    }
    
    public int getId()
    {
        return id;
    }
    
    public char getRace()
    {
        return race;
    } 
    
    public int getNumChild()
    {
        return numChild;
    }
    
    public double getIncome()
    {
        return income;
    }
    
    public String getState()
    {
        return state;
    }
    
    public String toString()
    {
        return ("ID :"+id+"\nRace :"+race+"\nNumber of child :"
        +numChild+"\nIncome :RM"+income+"\nState :"+state);
    }
}