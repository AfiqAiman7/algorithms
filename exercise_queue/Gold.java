public class Gold
{
    private String seriesNo;
    private String goldBrand;
    private int purity;
    private String goldType;
    private double goldPrice;
    
    public Gold(){}//default constructor
    
    public Gold(String sN,String gB,int p,String gT,double gP)//normal constructor
    {
        seriesNo=sN;
        goldBrand=gB;
        purity=p;
        goldType=gT;
        goldPrice=gP;
    }
    
    public void setSeriesNo(String sN)//setter
    {
        seriesNo=sN;
    }
    public void setGoldBrand(String gB)
    {
        goldBrand=gB;
    }
    public void setPurity(int p)
    {
        purity=p;
    }
    public void setGoldType(String gT)
    {
        goldType=gT;
    }
    public void setGoldPrice(double gP)
    {
        goldPrice=gP;
    }
    
    public String getSeriesNo()//getter
    {
        return seriesNo;
    }
    public String getGoldBrand()
    {
        return goldBrand;
    }
    public int getPurity()
    {
        return purity;
    }
    public String getGoldType()
    {
        return goldType;
    }
    public double getGoldPrice()
    {
        return goldPrice;
    }
    //display
    public String toString()
    {
        return "\nSeries No :"+seriesNo+"\nGold Brand :"+goldBrand+"\nPurity :"+
        purity+"\nGold Type :"+goldType+"\nGold Price :"+goldPrice;
    }
}