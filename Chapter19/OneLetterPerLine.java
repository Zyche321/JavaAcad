package Chapter19;
import java.util.Scanner;
public class OneLetterPerLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		int times = word.length(), index = 0;
		
		while (index < times) {
			System.out.println(word.charAt(index));
			index++;
		}
	}
}
