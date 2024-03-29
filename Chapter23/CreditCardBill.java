package Chapter23;
import java.util.Scanner;
import java.text.*;
public class CreditCardBill {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat numform = new DecimalFormat(); 
		int month = 0, totalPayments = 0;
		
		System.out.println("Enter the beginning balance:");
		double balance = scan.nextDouble();
		System.out.println("Enter the interest:");
		double charge = scan.nextDouble();
		System.out.println("Enter the monthly payment:");
		int monthlyPayment = scan.nextInt();

		while (balance >= 0) {
			double interest = balance * charge;
			balance = (balance + interest) - monthlyPayment;
			month += 1;
			totalPayments += monthlyPayment;
			System.out.println("Month: "+month+"\t Balance: "+ numform.format(balance)+ "\t total payments: "+totalPayments);
		}
	}
}