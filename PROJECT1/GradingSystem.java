package PROJECT1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GradingSystem {
   public static void main (String[] args) {
      Scanner scan = new Scanner (System.in);
	  DecimalFormat numform = new DecimalFormat("##.##"); 
      String remarks, term;
      byte scanOption;
      do {
    	 System.out.println("Welcome to Grade Calculator");
         System.out.print("[1] Compute Midterm Grade");
         System.out.print("\n[2] Compute Finals Grade");
         System.out.print("\n[3] Quit App");
         System.out.print("\nPress 1 or 2 or 3: ");
         scanOption = scan.nextByte();         
         if ( scanOption == 1 || scanOption == 2 ) {
             System.out.print("Enter the quiz grade: ");
             float quizGrade = scan.nextFloat();
             System.out.print("Enter the grade: ");
             float labGrade = scan.nextFloat();
             if (scanOption == 1)
            	 term = "Midterm";
             else
            	 term = "Finals";
             System.out.print("Enter the "+term+" exam grade: ");
             float examGrade = scan.nextFloat();
             if (quizGrade + labGrade + examGrade > 15.0)
                System.out.print("There was an error inputting your grade. Please try again.\n");
             else {
                float calculatedGrades = (quizGrade + labGrade + examGrade) / 3;
                System.out.print("\nMIDTERM GRADE: "+ numform.format(calculatedGrades));
                if (calculatedGrades <= 3.0)
                   remarks = "PASSED";
                else
                   remarks = "FAILED";
                System.out.println("\nREMARKS: "+ remarks+ "\n");
             }
         }
      }
      while (scanOption < 3);
      System.out.print("---SHUTTING DOWN---");
   }
}