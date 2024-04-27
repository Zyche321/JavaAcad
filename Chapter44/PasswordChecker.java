import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean upperChecker = false, digitChecker = false, lowerChecker = false;
        String password = null;
        //This do-while loop will continue if the password is not acceptable.
        do {
        System.out.print("\nEnter your password: "); 
        //This if statement will check if the input is empty or not.
        if (scan.hasNextLine()) {
            password = scan.nextLine().trim();
            //This for loop will check if the password is acceptable.
            for (int i = 0; i < password.length(); ++i) {
                if (Character.isUpperCase(password.charAt(i)))
                    upperChecker = true;
                else if (Character.isLowerCase(password.charAt(i)))
                    lowerChecker = true;
                else if (Character.isDigit(password.charAt(i)))
                    digitChecker = true;
            }
            //This if statement will check if it meets the requirements to be a acceptable password
            if (password.length() > 7 && upperChecker == true && lowerChecker == true && digitChecker == true) 
                System.out.print("Acceptable password.");
            else
                System.out.print("That password is not acceptable.");
        }
        else
            System.out.print("That password is not acceptable.");

        } while (upperChecker != true || lowerChecker != true || digitChecker != true);
    }
}