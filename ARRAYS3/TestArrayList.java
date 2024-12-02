import java.util.ArrayList;
 
public class TestArrayList 
{ 
     public static void main(String args[]) 
     {
         ArrayList<String>listName = new ArrayList<String>(); 
         listName.add("Umar"); 
         listName.add("Ilman"); 
         listName.add("Maryam"); 
         listName.add("Amir"); 
         listName.add("Asyraf"); 
  	 System.out.println("The list of sibling :"); 
         System.out.println(listName); 

         System.out.println("The first sibling is :"+ listName.get(0)); 
         System.out.println("The third sibling is: " + listName.get(2)); 
     } 
}
