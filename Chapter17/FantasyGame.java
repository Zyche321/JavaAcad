import java.util.Scanner;
public class FantasyGame {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the name of your character: ");
      String name = scan.nextLine();
      System.out.println("Enter strength (1-10): ");
      int strength = scan.nextInt();
      System.out.println("Enter health (1-10):");
      int health = scan.nextInt();
      System.out.println("Enter luck (1-10):");
      int luck = scan.nextInt();
      
      if ((strength + health + luck) > 15) {
         health = 5;
         strength = 5;
         luck = 5;
         System.out.println("You have give your character too many points!  Default values have been assigned:");
      }
      System.out.print(name+", strength: "+strength+", health: "+health+", luck: "+luck);
   }
}