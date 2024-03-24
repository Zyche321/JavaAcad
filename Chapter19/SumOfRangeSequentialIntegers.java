package Chapter19;
import java.util.Scanner;
public class SumOfRangeSequentialIntegers {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter low: ");
	        int low = scanner.nextInt();
	        System.out.print("Enter high: ");
	        int high = scanner.nextInt();

	        int sumHigh = (high * (high + 1)) / 2;
	        int sumLowMinusOne = ((low - 1) * (low)) / 2;
	        int sum = sumHigh - sumLowMinusOne;

	        System.out.println("Sum = " + sum);
	    }
	}