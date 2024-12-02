public class Malaysian extends ChaletOwner
{
    final int freeTaxPeriod=5;
    public Malaysian(String cn,String cID,int y,double p)
    {
        super(cn,cID,y,p);
    }//method definitions 
    public double calcTax()
    {
        double totalCharge=0.0,tax=0.0;
        if(getYearOpen()>freeTaxPeriod)
        {
            tax=0.25;
            totalCharge=(getProfit()*tax)+getProfit();
        }
        else
        {
            tax=0.0;totalCharge=getProfit();
        }
        return totalCharge;
    }
}