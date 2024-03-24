package Chapter18;
import java.util.Scanner;
public class CheckCharge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double serviceCharge = 0.0;
		System.out.print("Enter the balance of your checking account: $");
		int checkTotal = scan.nextInt();
		System.out.print("Enter the balance of your saving account: $");
		int savingsTotal = scan.nextInt();
		
		if (checkTotal <= 1000 || savingsTotal <= 1500 ) {
			System.out.print("Enter how many chekcs you've written: ");
			int checks = scan.nextInt();
			serviceCharge = checks * 0.15;
		}
		System.out.printf("\nThe total service charge: $%.2f", serviceCharge);
	}
}