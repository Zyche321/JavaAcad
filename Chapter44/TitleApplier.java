import java.util.Scanner;
public class TitleApplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String name;
        //This block of statement will loop if the user enters a name, if it doesn't enter a name it ends.

        do {
            System.out.println("\nEnter a name: ");
            name = scan.nextLine();
            
        //This else if statement checks the name to put a title of the name using the method startsWith.
            if (name.startsWith("Amy") || name.startsWith("Cathy") || name.startsWith("Buffy")) 
                System.out.println("Ms. "+name);
            else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham"))
                System.out.println("Mr. "+name);
            else
                System.out.println(name);
        } while (name.length() > 0);
    }
}