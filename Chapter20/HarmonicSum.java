package Chapter20;
import java.util.Scanner;
public class HarmonicSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter N");
		int n = scan.nextInt();
		int i = 1;
		double sum = 0;
		
		while (i <= n) {
			sum += 1.0 / (float)i;
			i++;
		}
		System.out.print("\nSum is: "+ sum);
	}
}
