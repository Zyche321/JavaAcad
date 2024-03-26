import java.util.Scanner;
public class TownDump {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int charge = 0;
      
      System.out.print("How many pounds of trash would you like to dispose: ");
      int pounds = scan.nextInt();
      
      if (pounds <= 200)
         charge +=20;
      else  
         charge = (pounds - 200) / 100 * 8 + 20;
         
      System.out.print("Total of "+pounds+" pounds of trash charges: $"+ charge);
   }
}