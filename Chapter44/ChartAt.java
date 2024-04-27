import java.util.Scanner;
public class ChartAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a string: ");
        String name = scan.nextLine();
        //This loop will print out each character in the string.
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
