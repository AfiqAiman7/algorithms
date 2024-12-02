
public class CovidPatient {

    private String patName; // patient's name
    private int patIC; // patient's Identification Card
    private String cVariant; // Covid virus variant - SARS-CoV-2, Omicron, Alpha, Beta
    private String quarantineDate; // date start quarantine
    private int cStatus; // Covid status: 1-positif or 0-negative
    private float oLevel; // Oksigen level
    private int cCategory; // Covid category: 1,2,3,4,5

    public CovidPatient() { // default constructor
        patName = "";
        patIC = 0;
        cVariant = "";
        quarantineDate = "";
        cStatus = 0;
        oLevel = 0.0f;
        cCategory = 0;
    }

    public CovidPatient(String name, int ic, String variant, String date, int status, float level, int category) { // normal constructor
        patName = name;
        patIC = ic;
        cVariant = variant;
        quarantineDate = date;
        cStatus = status;
        oLevel = level;
        cCategory = category;
    }

    public String getName() { // accessor method
        return patName;
    }

    public int getIC() { // accessor method
        return patIC;
    }

    public String getcVariant() { // accessor method
        return cVariant;
    }

    public String getQuarantineDate() { // accessor method
        return quarantineDate;
    }

    public int getCStatus() { // accessor method
        return cStatus;
    }

    public float getOLevel() { // getoLevel
        return oLevel;
    }

    public int getCCategory() { // accessor method
        return cCategory;
    }

    public void setCovidPatient(String name, int ic, String variant, String date, int status, float level, int category) { // mutator
        patName = name;
        patIC = ic;
        cVariant = variant;
        quarantineDate = date;
        cStatus = status;
        oLevel = level;
        cCategory = category;
    }

    public void setVariant(String variant) { // mutator
        cVariant = variant;
    }

    public void setStatus(int status) { // mutator
        cStatus = status;
    }

    public void setoLevel(float level) { // mutator
        oLevel = level;
    }

    public void setcCategory(int category) { // mutator
        cCategory = category;
    }

    public void displayInfo() { // display patient's info
        System.out.println("Patient Name: " + patName);
        System.out.println("Patient IC: " + patIC);
        System.out.println("Covid Variant: " + cVariant);
        System.out.println("Quarantine Date: " + quarantineDate);
        System.out.println("Covid Status: " + cStatus);
        System.out.println("Oxygen Level: " + oLevel);
        System.out.println("Covid Category: " + cCategory);
    }
}