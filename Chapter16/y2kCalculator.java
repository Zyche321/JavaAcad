import java.util.Scanner;
public class y2kCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Year of birth: ");
		int birth = scan.nextInt();
		System.out.print("Current year: ");
		int year = scan.nextInt();
			
		if (birth >= year) {
			year+=100;
			System.out.print("Your  age: "+ (year - birth));
		}
		else
			System.out.print("Your age: "+ (year-birth));
	}
}
