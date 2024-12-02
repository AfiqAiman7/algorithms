public class WeddingContract 
{
    private String contractID;        //w001,w002 
    private String Name;    	//customer
    private String date;    		//14/3/18
    private String venue;    	//hotel, hall, home, etc 
    private double budget; 	//10000.00
    private int numOfGuest; 	//200, 500, 1000, etc

    public WeddingContract()
    {    }

    public WeddingContract (String cID, String n, String d, String v , double b, int nG)
    {
        contractID = cID; 
        Name = n; 
        date=d;
        venue=v; 
        budget=b; 
        numOfGuest=nG;
    }

    public String getContractID() {return contractID;} 
    
    public String getName() {return Name;}

    public String getDate() {return date;} 
    
    public String getVenue() {return venue;} 
    
    public double getBudget() {return budget;}

    public int getNumberOfGuest() {return numOfGuest; }

    public String toString()
    {    return "\n\nContract ID    : "+contractID+ "\nName    : "+Name+ "\nDate    : "+date+  "\nVenue    : "+venue+
        "\nBudget    : "+budget+ "\nNumber of guest : "+numOfGuest;}

}
