import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner ducay = new Scanner(System.in);

        System.out.print("Enter amount of purchases: ");
        int  purchaseAmount = ducay.nextInt();

        if (purchaseAmount > 10) 
            System.out.println("Discount Price: "+ (int)(purchaseAmount - (purchaseAmount * 0.1)));
        else
            System.out.println("Discounted Price: "+ purchaseAmount);
    }
}