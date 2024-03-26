import java.util.Scanner;
public class AgeSeconds {
   public static void main (String[] args) {
      
      Scanner scan = new Scanner(System.in);
      int totalDays;
      System.out.print("Enter your age in years: ");
      int year = scan.nextInt();
      System.out.print("Enter your age in months: ");
      byte months = scan.nextByte();
      System.out.print("Enter your age in days: ");
      byte days = scan.nextByte();
      
      totalDays = year * 365 + days;
      
      if (months > 1)
          totalDays += 31;
      if (months > 2)
         totalDays += 28;
      if (months > 3)
         totalDays += 31;
      if (months > 4)
         totalDays += 30;
      if (months > 5)
         totalDays += 31;
      if (months > 6)
         totalDays += 30;
      if (months > 7)
         totalDays += 31;
      if (months > 8)
         totalDays += 31;
      if (months > 9)
         totalDays += 30;
      if (months > 10)
         totalDays += 31;
      if (months > 11)
         totalDays += 30;
         
      
      int seconds = totalDays * 24 * 60* 60;
      double lifespan = (seconds / 2.e9) * 100;
      System.out.println("You have lived for "+seconds+" seconds in your world");
      System.out.printf("The expected percentage of your lifespan is %%%.1f", lifespan);
      
   }
}