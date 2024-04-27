import java.util.Scanner;
public class MicrowaveMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter cook time: ");
        int time = scan.nextInt();

        int minutes = time / 100 ;
        int seconds = time % 100;

        if (minutes > 99)
            minutes = 0;

        System.out.print(minutes+":"+seconds);
    }
}