package Chapter17;
import java.util.Scanner;
public class MicrowaveHeatingTime {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter how many items you would like to heat up: ");
		int items = scan.nextInt();
		System.out.print("Enter how many minutes to be heated in one item : ");
		int time = scan.nextInt();
		
		if (items <= 3) {
			if (items ==  1) {
				int minutes = time / 100 % 10;
				int seconds  = time % 100;
				System.out.printf("Heat for %d minutes %d seconds: ", minutes, seconds);
			}
			else if (items == 2) {
				items = items / time;
				int minutes = time / 100 % 10;
				int seconds  = time % 100;
				System.out.printf("Heat for %d minutes %d seconds: ", minutes, seconds);
			}
			else {
				time = time + items;
				int minutes = time / 100 % 10;
				int seconds  = time % 100;
				System.out.printf("Heat for %d minutes %d seconds: ", minutes, seconds);
			}
		}
	}
}
