import java.util.Scanner;
public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine().trim();

        //Detects the white space of the user's input.
        int spaceIndex = name.indexOf(" ");
        //Gets the string of the firstName
        String firstName = name.substring(0, spaceIndex);
        //Gets the string of the lastName
        String lastName = name.substring(spaceIndex).toUpperCase();

        //The firstName and lastName is combined together and print the final result.
        System.out.print(firstName.concat(lastName));
    }
}