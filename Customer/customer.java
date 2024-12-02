public class customer
{
    private String custName;
    private String custTel;
    private String orderMenu;
    private int orderUnit;
    
    public customer(String cN,String cT,String oM,int oN)
    {
        custName=cN;
        custTel=cT;
        orderMenu=oM;
        orderUnit=oN;
    }
    public void setCust(String cN,String cT,String oM,int oN)
    {
        custName=cN;
        custTel=cT;
        orderMenu=oM;
        orderUnit=oN;
    }
    public String getCustName()
    { 
        return custName;
    }
    public String getCustTel()
    { 
        return custTel;
    }
    public String getOrderMenu()
    {
        return orderMenu;
    }
    public int getOrderUnit()
    { 
        return orderUnit;
    }
    public String toString()
    {
        return"Customername:"+custName+"\nCustomerTel:"+custTel+"\nOrderMenu:"+orderMenu+"\nOrderUnit:"+orderUnit;
    }
}