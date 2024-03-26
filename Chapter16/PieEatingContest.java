import java.util.Scanner;
public class PieEatingContest {
   public static void main(String[] args) {
      
      final int weightMaximum = 250, weightMinimum = 30;
      Scanner in = new Scanner(System.in);
      
      System.out.print ("Enter your weight in pounds: ");
      int pounds = in.nextInt();
      
      if (pounds <= weightMaximum && pounds >= weightMinimum)
         System.out.print("You're allowed to participate in the contest.");
      else
         System.out.print("\nYou're not allowed to participate in the contest.");
      }   
}
