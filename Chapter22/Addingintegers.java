package Chapter22;
import java.util.Scanner;
public class Addingintegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		System.out.print("Enter first integer (enter 0 to quit): ");
		int firstInteger = scan.nextInt();
		if (firstInteger == 0)
			System.out.println("No integers were entered.");
		else {
			while (firstInteger != 0) { 
				sum += firstInteger;
				while (firstInteger != 0) {
					System.out.print("Enter an integer (or 0 to quit): ");
					int nextInteger = scan.nextInt();
					sum += nextInteger;	
					if (nextInteger == 0)
						break;
				}
				System.out.println("Sum of the integers: "+ sum);
				break;
			}
		}
		System.out.println("bye");
	}
}