package Chapter21;
import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i = 0;
		double x, total = 1;
		
		System.out.println("Enter X");
		x = scan.nextDouble();
		System.out.println("Enter N");
		int n = scan.nextInt();
		
		if (n >= 0) {
			while (n < 0)
				total = 0;
			while (i < n) {
				total *= x ;
				i++;
			}
			System.out.print(x +" raised to the power "+n+" is: "+total);

		}
		else
			System.out.print("N must be a positive integer");
		scan.close();
	}
}