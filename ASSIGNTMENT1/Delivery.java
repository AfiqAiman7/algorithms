public class Delivery
{
    private String type;     //e.g: FoodPanda, GrabFood, etc 
    private String area;     //e.g: Marang, Dungun, etc 
    private double order;    //total price of order in RM
    private double distance;    //distance in kilometer 
    private double charge;     //delivery charge per kilometer
    
    public Delivery(){}//default constractor
    
    public Delivery(String t, String a, double o, double d, double c)//normal constructor
    {
        this.type=t;
        this.area=a;
        this.order=o;
        this.distance=d;
        this.charge=c;
    }
    
    public void setType(String t)//mutator
    {
        type=t;
    }
    
    public void setArea(String a)
    {
        area=a;
    }
    
    public void setOrder(double o)
    {
        order=o;;
    }
    
    public void setDistance(double d)
    {
        distance=d;
    }
    
    public void setCharge(double c)
    {
        charge=c;
    }
    
    public String getType()//retriever/accessor
    {
        return type;
    }
    
    public String getArea()
    {
        return area;
    }
    
    public double getOrder()
    {
        return order;
    }
    
    public double getDistance()
    {
        return distance;
    }
    
    public double getCharge()
    {
        return charge;
    }
    
    public double totalCharge()//processor
    {
        double totalCharge=0.00;
        totalCharge=(charge*distance)+order;
        return totalCharge;
    }
    
    public String toString()//Printer
    {
        return ("Type :"+type+"\tArea :"+area+"\tOrder :"+
        order+"\tDistance :"+distance+"\tCharge :"+charge);
    }
}