import java.util.Scanner;
import java.lang.Math;
public class WindChillIndex {
   public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Enter Wind Speed:");
      float windSpeed = scan.nextFloat();
      System.out.println("Enter Temperature:");
      float temperature = scan.nextFloat();
      
      if (windSpeed < 3 || temperature > 50)
         System.out.print("The wind chill is "+ temperature);
      else
         System.out.print("The wind chill is "+ (35.74 + 0.6215 * temperature - 35.75 * Math.pow (windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16)));
   }
}
