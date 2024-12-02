public class Toys
{
    private String toyName;
    private String brand;
    private char gender;
    private String category;
    private String toyType;
    private double price;
    
    public Toys()
    {
        toyName="";
        brand="";
        gender=' ';
        category="";
        toyType="";
        price=-1;
    }
    public Toys(String toyName, String brand, char gender, String category, String toyType, double price)
    {
        this.toyName= toyName;
        this.brand= brand;
        this.gender=gender;
        this.category=category;
        this.toyType=toyType;
        this.price=price;
    }
    public String getToyName()
    {
        return toyName;
    }
    public String getBrand()
    {
        return brand;
    }
    public char getGender()
    {
        return gender;
    }
    public String getCategory()
    {
        return category;
    }
    public String getToyType()
    {
        return toyType;
    }
    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return("Toy Name : "+toyName+"\tBrand : "+brand+"\tGender : "+gender+
        "\tCategory : "+category+"\tToy Type : "+toyType+"\tPrice : RM"+price);
    }
}