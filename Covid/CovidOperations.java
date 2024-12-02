import java.util.ArrayList;
import java.util.LinkedList;

public class CovidOperations {
    public static void main(String[] args) {
        // Assuming covid19List is an ArrayList containing CovidPatient objects with patient data

        // i. Declare LinkedList objects for Omicron and Epsilon variants
        LinkedList<CovidPatient> OmicronList = new LinkedList<>();
        LinkedList<CovidPatient> EpsilonList = new LinkedList<>();

        // ii. Copy patients with Omicron and Epsilon variants to respective LinkedLists
        for (CovidPatient patient : covid19List) {
            if (patient.getcVariant().equals("Omicron")) {
                OmicronList.add(patient);
            } else if (patient.getcVariant().equals("Epsilon")) {
                EpsilonList.add(patient);
            }
        }

        // iii. Search and display details of patients in categories 4 and 5 with low oxygen levels from covid19List
        System.out.println("Patients in category 4 or 5 with oxygen level < 90:");
        for (CovidPatient patient : covid19List) {
            if ((patient.getCCategory() == 4 || patient.getCCategory() == 5) && patient.getOLevel() < 90) {
                patient.displayInfo(); // Assuming displayInfo() method prints patient details
            }
        }

        // iv. Display details of patients in EpsilonList confirmed negative and ready for discharge
        System.out.println("Patients in EpsilonList confirmed negative and ready for discharge:");
        for (CovidPatient patient : EpsilonList) {
            if (patient.getCStatus() == 0) {
                patient.displayInfo(); // Assuming displayInfo() method prints patient details
            }
        }
    }
}