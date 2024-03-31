package JAVA_ACAD.Chapter16;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final float normAdult = 8, matineeAdult = 5, normChild = 4, childMatinee = 2;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.print("Enter current time in Military Time (exe. 4:30PM is 1630): ");
		int time = scan.nextInt();
		
		if (age > 13) {
			if (time >= 1300 && time <= 1700)
				System.out.print ("The price of the ticket is $"+ matineeAdult);
			else
				System.out.print ("The price of the ticket is $"+ normAdult);
		}
		else {
			if (time >= 1300 && time <= 1700)
				System.out.print ("The price of the ticket is $"+ childMatinee);
			else
				System.out.print ("The price of the ticket is $"+ normChild);
		}
	}
}
