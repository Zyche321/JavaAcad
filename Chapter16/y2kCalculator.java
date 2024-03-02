package JAVA_ACAD.Chapter16;
import java.util.Scanner;
public class y2kCalculator {

	public static void main(String[] args) {
		Scanner ducay = new Scanner(System.in);
		int age;
		
		System.out.print("Year of birth: ");
		int birth = ducay.nextInt();
		System.out.print("Current year: ");
		int year = ducay.nextInt();
			
		if (birth >= year) {
			year+=100;
			System.out.print("Your age: "+ (year - birth));
		}
		else
			System.out.print("Your age: "+ (year-birth));
	}
}