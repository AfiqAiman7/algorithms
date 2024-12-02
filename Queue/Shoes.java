public class Shoes
{
    private String type;
    private String style;
    private int size; 
    private double price;
    
    public Shoes()
    {}
    public Shoes(String type, String style, int size, double price )
    {
        this.type= type;
        this.style= style;
        this.size= size;
        this.price=price;
    }

    public String getType()
    {
        return type;
    }
    
    public String getStyle()
    {
        return style;
    }
    public int getSize()
    {
        return size;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        return("Type : " +type + "Style :"+style + "Size : "+size+"Price : RM"+price);
    }
}