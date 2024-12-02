import java.util.ArrayList;
import java.util.Random;
 
public class ArrayListDemo1 
{
   public static void main(String[] args) {
      ArrayList<String> planets = new ArrayList<>();
      planets.add("Mercury");
      planets.add("Earth");
      planets.add("Jupiter");
      planets.add("Saturn");
 
      System.out.println(planets);
      int index = planets.indexOf("Earth");
      planets.remove(index);
      planets.add(1, "Venus");
      System.out.println("Size = " + planets.size());
      for (index = 0; index < planets.size(); index++) {
         System.out.println(planets.get(index));
      }
   }
}
