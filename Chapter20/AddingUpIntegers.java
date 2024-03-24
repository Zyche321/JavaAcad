package Chapter20;
import java.util.Scanner;
public class AddingUpIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int firstInt = 0, toDo = 0;
		
		System.out.println("How many integers will be added:");
		int times = scan.nextInt();
		
		while (toDo < times) {
			System.out.println("Enter an integer");
			firstInt = scan.nextInt();
			firstInt =+ firstInt;
			toDo++;
		}
		System.out.println("The sum is "+ firstInt);
	}
}