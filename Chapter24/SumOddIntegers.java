package Chapter24;
import java.util.Scanner;
public class SumOddIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		System.out.print("Enter an integer: ");
		int value = scan.nextInt();
		
		for (int i = 1; i <= value; i+=2)
			sum+=i;
		System.out.println("The sum of the all odd integers is: "+ sum);
		System.out.println("The N squared is: "+ value * value);
	}
}