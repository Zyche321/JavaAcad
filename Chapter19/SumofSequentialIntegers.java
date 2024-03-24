package Chapter19;
import java.util.Scanner;
public class SumofSequentialIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int loopSum = 0, i = 1;
		
		System.out.println("Enter N:");
		int n = scan.nextInt();
		
		while (i <= n) {
			loopSum += i;
			i++;
		}
		int sum = (n*(n+1))/2;
		
		System.out.println("Loop Sum: "+ loopSum);
		System.out.println("Formula Sum: "+sum);
	}
}