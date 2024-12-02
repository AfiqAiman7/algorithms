public class NonMalaysian extends ChaletOwner
{
    private int yearContract;//Normal constructor
    public NonMalaysian(String cn,String cID,int y,double p,int yC)
    {
        super(cn,cID,y,p);
        yearContract=yC;
    }
    public double calcTax()
    {
        double totalCharge=0.0,tax=0.0;
        tax=0.50;
        totalCharge=(getProfit()*tax)+getProfit();
        return totalCharge;
    }
}
