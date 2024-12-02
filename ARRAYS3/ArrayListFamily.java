import java.util.ArrayList;
 
public class ArrayListFamily { 
  public static void main(String args[])
  {
         ArrayList<String> Family= new ArrayList<String>();
         System.out.println("Size of arraylist Family :"+ Family.size());                               
         if (Family.isEmpty())
            System.out.println("ArrayList Family is empty");
         else
            System.out.println("ArrayList Family is not empty");
 
         Family.add("Mazlan");
         Family.add("Anisah");
         Family.add("”Umar");
         Family.add("Maryam");
         Family.add(2, "Amir");
         Family.add(3, "Asyraf");
         Family.add(4, "Ilman");
 
         System.out.println("Size of arraylist Family : " + Family.size());
         System.out.println("Contents of arraylist Family : ");
         System.out.println(Family);
         System.out.println("Element at index 2 : " + Family.get(2));        
         System.out.println("Remove element at index 2");
         Family.remove(2);
         System.out.println("Contents of arraylist Family : ");
         System.out.println(Family);
         System.out.println("Remove element Asyraf");
         Family.remove("Asyraf");
         System.out.println("Contents of arraylist Family : ");
         System.out.println(Family);
         
         if (Family.contains("Anisah"))
            System.out.println("ArrayList Family contains Anisah");
         else
            System.out.println("ArrayList Family does not contain Anisah");
 
         if (Family.contains("Umar"))
            System.out.println("ArrayList Family contains Umar");
         else
            System.out.println("ArrayList Family does not contain Umar");
            
         Family.set(2, "Aishah"); //replace
         System.out.println("Contents of arraylist Family : ");
         System.out.println(Family);
         Family.clear();
         if (Family.isEmpty())
            System.out.println("ArrayList Family is empty");
         else
            System.out.println("ArrayList Family is not empty");
     }
}

