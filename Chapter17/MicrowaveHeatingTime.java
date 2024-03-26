import java.util.Scanner;
public class MicrowaveHeatingTime {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many items to heat: ");
      int items = scan.nextInt();
      System.out.print("Time for item: ");
      int time = scan.nextInt();
      
      if (items <= 3){
         if (items == 2){
            double computedTime = time * 0.5;
            time += computedTime;
         } 
         else if (items == 3)
            time = time * 2;
      }
      else
         System.out.print("The items exceeded, 3 items is the minimum to put in microwave. Please try again.");
         
      System.out.print("Heat for "+time / 100+" minutes "+time % 100+" seconds");
   }  
}