abstract class ChaletOwner//abstract class
{
    private String chaletName;
    private String chaletID;
    private int yearOpen;
    private double profit;
    //normal constructor 
    public ChaletOwner(String cn,String cID,int y,double p)
    {
        chaletName=cn;
        chaletID=cID;
        yearOpen=y;
        profit=p;
    }
    //getter 
    public String getchaletName()
    {
        return chaletName;
    }
    public String getchaletID()
    {
        return chaletID;
    }
    public int getYearOpen()
    { 
        return yearOpen;
    }
    public double getProfit()
    { 
        return profit;
    }//toString 
    public String toString()
    {
        return"Chalet Name:"+chaletName+"\nChalet ID:"+chaletID+"Year Open:"+yearOpen+"Profit:"+profit;
    }
    abstract double calcTax();
    //abstractmethod
}