import javax.swing.JOptionPane;
import java.util.ArrayList;

public class weddingApp
{
    public static void main(String [] args)
    {
        WeddingContract W= new WeddingContract(); 
        ArrayList<WeddingContract> weddingList = new ArrayList<>();

        // to input 5 wedding info
        for (int i=0; i<5; i++)
        {
            String contractID =JOptionPane.showInputDialog("Enter contract ID : "); 
            String Name = JOptionPane.showInputDialog("Enter name : ");
            String date = JOptionPane.showInputDialog("Enter date : "); 
            String venue= JOptionPane.showInputDialog("Enter Venue : "); 
            String budget = JOptionPane.showInputDialog("Enter Budget : "); 
            double b= Double.parseDouble(budget);
            String numberGuest = JOptionPane.showInputDialog("Enter number of guests : ");
            int nG = Integer.parseInt(numberGuest);

            W = new WeddingContract(contractID, Name, date, venue, b,nG); 
            
            weddingList.add(W);
        }

        // to display all data
        System.out.println("\nOriginal Wedding Information...");
 
        for(int i=0; i<weddingList.size(); i++)
        { 
            W = (WeddingContract)weddingList.get(i); 
            System.out.println(W.toString());
        }

        //count the number of guests > 1000 at Hall
        int hall = 0;
        for (int i=0; i<weddingList.size(); i++)
        {
            WeddingContract S = (WeddingContract) weddingList.get(i);

            if(S.getVenue().equalsIgnoreCase ("Hall") &&  S.getNumberOfGuest()> 1000)
                hall ++ ;
        }
        
        System.out.println("\n\nNumber of guest for Hall with number of guests > 1000: "+hall);


        //display the date based on contractID
        String cID = JOptionPane.showInputDialog("Enter Contract ID to find the date : ");
        boolean found = false;
 
        for (int i=0; i<weddingList.size() && !found; i++)
        {
            WeddingContract S = (WeddingContract) weddingList.get(i);

            if(S.getContractID().equalsIgnoreCase (cID))
            {
                    System.out.println ("\nThe wedding date is : " + S.getDate ()); 
                    found = true;
            }
        }
            
        if(!found)
            System.out.println("\nData is not available");


 
        //Bubble Sort in ascending order based on the ContractID
        for(int x=0; x<weddingList.size()-1; x++) 
        {
            for (int y=0; y<weddingList.size() - (x+1); y++) 
            { 
                WeddingContract p1 = weddingList.get(y); 
                WeddingContract p2 = weddingList.get(y+1); 
                String p1ID = p1.getContractID();
                String p2ID = p2.getContractID(); 
                        
                if (p1ID.compareTo(p2ID) > 0) //sort in ascending order
                {
                    weddingList.set(y, p2); 
                    weddingList.set(y+1, p1);
                }
            }
        }

        System.out.println("Display data in ascending order ..."); 
            
        for (int i=0; i<weddingList.size(); i++)
        {
            WeddingContract S = (WeddingContract) weddingList.get(i); 
            System.out.println(S.toString());
        }
            
        //Bubble Sort in descending order based on the ContractID
        for(int x=0; x<weddingList.size()-1; x++) 
        {
            for (int y=0; y<weddingList.size() - (x+1); y++) 
            { 
                WeddingContract p1 = weddingList.get(y); 
                WeddingContract p2 = weddingList.get(y+1); 
                String p1ID = p1.getContractID();
                String p2ID = p2.getContractID(); 
                        
                if (p1ID.compareTo(p2ID) < 0) //sort in descending order
                {
                    weddingList.set(y, p2); 
                    weddingList.set(y+1, p1);
                }
            }
        }

        System.out.println("Display data in ascending order ..."); 
            
        for (int i=0; i<weddingList.size(); i++)
        {
            WeddingContract S = (WeddingContract) weddingList.get(i); 
            System.out.println(S.toString());
        }

            

        //Binary Search based on contractID (reference : https://www.youtube.com/watch?v=3fzUvFD0-xE )

        String contractID = JOptionPane.showInputDialog("Enter contract id to find: "); //key value to be search

        int low = 0; //initialise the lowest index
        int high = weddingList.size()-1; //initialise the highest index 
        int keyIndex = -1; //initialise the target key index
                
        while (high >= low)
        {
            int mid = (low + high) / 2;

            WeddingContract S = weddingList.get(mid); 
            cID = S.getContractID();

            if (contractID.compareTo(cID)==0)
            {
                keyIndex = mid; 
                break;
            }
            else if(contractID.compareTo(cID)>0) 
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (keyIndex == -1)
            System.out.println("\n No record found for this contract ID : " + contractID);
 
        else
        {
            WeddingContract S = weddingList.get(keyIndex);
            System.out.println("\nThe contract ID : "+contractID+" found in the list is "); 
            System.out.println(S.toString());
        }

    }
}

