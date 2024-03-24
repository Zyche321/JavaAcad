package Chapter20;
import java.util.Scanner;
public class AverageStandardDeviationOfNumbers {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		double avg = 0, avgSqr = 0;
		int i = 1;
		System.out.println("Enter the N: ");
		int valueN = scan.nextInt();
		
		
		while (i <= valueN) {
			System.out.print("Enter a floating point number: ");
			avg += scan.nextDouble();
			avgSqr = avg * avg;
			i++;
		}
		System.out.println("sum "+ avg +" "+avgSqr);
	}
}