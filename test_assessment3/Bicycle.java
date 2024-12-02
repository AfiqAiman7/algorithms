public class Bicycle
{
    private String brand;     
    private String type;      
    private double price;    
    private char material;
    
    public Bicycle(){}//default constractor
    
    public Bicycle(String b, String t, double p, char m)//normal constructor
    {
        this.brand=b;
        this.type=t;
        this.price=p;
        this.material=m;
    }
    
    public void setBrand(String b)
    {
        brand=b;
    }
    
    public void setType(String t)//mutator
    {
        type=t;
    }
    
    public void setPrice(double p)
    {
        price=p;
    }
    
    public void setMaterial(char m)
    {
        material=m;
    }
    
    public String getBrand()
    {
        return brand;
    } 
    
    public String getType()//retriever/accessor
    {
        return type;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public char getMaterial()
    {
        return material;
    }

    public String toString()//Printer
    {
        return "Brand : "+brand+ "Type : "+type+"Price : "+
        price+"Material : "+material;
    }
}
