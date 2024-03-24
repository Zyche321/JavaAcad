package Chapter18;
import java.util.Scanner;
public class RepeatedlyEchoWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String inputString = scan.nextLine();
		System.out.println("");

		int times = inputString.length(), i = 0;

		while (i < times) {
			System.out.println(""+ inputString);
			i++;
		}
		scan.close();
	}
}