package Chapter18;
import java.util.Scanner;
public class TirePressure {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Input right front from pressure");
		int rightFront = scan.nextInt();
		System.out.println("Input left front from pressure");
		int leftFront = scan.nextInt();
		System.out.println("Input right rear from pressure");
		int rightRear = scan.nextInt();
		System.out.println("Input left rear from pressure");
		int leftRear = scan.nextInt();
		
		if (rightFront == leftFront && rightRear == leftRear) {
			if (rightFront < 45 && rightFront > 35 || leftFront < 45 && leftFront > 35)
				System.out.print("Both tire pressure must be same amount.");
		}
		scan.close();
	}

}