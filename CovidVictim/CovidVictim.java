public class CovidVictim
{
    private String victimName;
    private String caseId;
    private int age;
    private String clusterName;    // Teratai, Nibong & Lestari
    private String positiveDate; // DDMMYYYY e.g 08112020
    
    public CovidVictim(){}
    
    public CovidVictim(String vN, String cID, int a, String cN, String pD)
    {
        this.victimName=vN;
        this.caseId=cID;
        this.age=a;
        this.clusterName=cN;
        this.positiveDate=pD;
    }
    
    public String getVictimName()
    {
        return victimName;
    }
    
    public String getCaseID()
    {
        return caseId;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getClusterName()
    {
        return clusterName;
    }
    
    public String getPositiveDate()
    {
        return positiveDate;
    }
    /* All the accessor methods */
    public void displayVictim()
    {
        System.out.println("Victim Name : "+victimName+
        " Case ID : "+caseId+
        " Victim Age : "+age+
        " Cluster Name : "+clusterName+
        " Positive Date : "+positiveDate);
    }

}