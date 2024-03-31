import java.util.Scanner;
public class MatineeMovieTicket {
	public static void main(String[] args) {
		final double normAdult = 8.00, matineeAdult = 5.00, normChild = 4.00, childMatinee = 2.00;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.print("Enter current time in Military Time (exe. 4:30PM is 1630): ");
		int time = scan.nextInt();
		
		if (age > 13) {
			if (time >= 100 && time <= 1700)
				System.out.printf ("The price of the ticket is $%.2f", matineeAdult);
			else
				System.out.printf ("The price of the ticket is $%.2f",normAdult);
		}
		else {
			if (time >= 100 && time <= 1700)
				System.out.printf ("The price of the ticket is $%.2f", childMatinee);
			else
				System.out.printf ("The price of the ticket is $%.2f", normChild);
		}
	}
}
