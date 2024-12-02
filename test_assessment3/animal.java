import java.util.ArrayList;

public class animal
{
    public static void main(String[] args)
    {
        ArrayList <String> animals = new ArrayList<String>(); 
         
        animals.add("CAT");
        animals.add("FISH");
        animals.add("DOG");
        animals.add("ELEPHANT");
        animals.add("MOUSE");
        animals.add("HORSE"); 
        
        //#####C
        for(int i=0; i<animals.size(); i++) {
        	for(int j=0; j<animals.size()-1; j++) { 
        		if(animals.get(j).compareTo(animals.get(j+1))<0)//***
          		{	String value = animals.get(j);
             			animals.set(j, animals.get(j+1));
             			animals.set((j+1), value);
          		}
        	}
        }
        
        for(int i =0;i<animals.size();i++)
          	System.out.println(animals.get(i));
    }
}
