public class Car
{
    private String brand;
    private String chassisNum;
    
    public Car()
    {
    }
    public Car(String brand, String chassisNum)
    {
        this.brand= brand;
        this.chassisNum= chassisNum;
    }
    public void setBrand(String brand)
    {
        brand=brand;
    }
    public void setChassisNum(String chassisNum)
    {
        chassisNum=chassisNum;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getChassisNum()
    {
        return chassisNum;
    }

    public String toString()
    {
        return("Car Brand : "+brand+"Chassis Number "+chassisNum);
    }
}