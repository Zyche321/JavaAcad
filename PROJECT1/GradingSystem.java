import java.text.DecimalFormat;
import java.util.Scanner;
public class GradingSystem {
   public static void main (String[] args) {
      Scanner scan = new Scanner (System.in);
	  DecimalFormat numform = new DecimalFormat("##.##"); 
      String remarks, term, inputString;
      byte scanOption = 0;
      // This loop runs the code then checks the condition
      do {
         System.out.print("Welcome to Grade Calculator \n[1] Compute Midterm Grade \n[2] Compute Finals Grade \n[3] Quit App \nPress 1 or 2 or 3: ");
         //This condition checks if the user input a number 
         if (scan.hasNextByte()) {
             scanOption = scan.nextByte();    
            //This condition checks if the user wants to calculate for the Midterm [1] or Finals [2]
             if ( scanOption == 1 || scanOption == 2 ) {
         	 System.out.print("Enter your Quiz Grade: ");
         	 float quizGrade = scan.nextFloat();
         	 System.out.print("Enter your Labworks Grade: ");
         	 float labGrade = scan.nextFloat();
            //This condition checks if the previous condition chooses Midterm or Finals
         	 if (scanOption == 1)
         		term = "Midterm";
         	 else
         	 	term = "Finals";
            
         	 System.out.print("Enter your "+term+" Exam Grade: ");
         	 float examGrade = scan.nextFloat();
            // This condition checks if the grades that was asked exceeds more than 5
         	 if (quizGrade > 5 || labGrade > 5 || examGrade > 5)
         		 System.out.println("There was an error inputting your grade. Please try again.\n");
         	//This block of code calculates the grade that was given by the user
         	 else {
         		 double calculatedGrades = ((quizGrade * 0.20) + (labGrade * 0.40) + (examGrade * 0.40));
         		 System.out.print("\nMIDTERM GRADE: "+ numform.format(calculatedGrades));
                //This condition checks the grade if it passes or failed
         		 if (calculatedGrades <= 3.0)
         			 remarks = "PASSED";
         		 else
         			 remarks = "FAILED";
                
         		 System.out.println("\nREMARKS: "+ remarks+ "\n");
         		}
         	}
            //This condition determines that it can't exceed more than 3 since there were only three choices that was asked by the program
           else if (scanOption > 3)
        	   System.out.println("Please choose between to the options that was instructed.\n");
         }
         //This condition checks if the user puts a string or words in the asked choices
        else if (scan.hasNext()) {
        	inputString = scan.nextLine();
    		System.out.println("There was an error in your input, Please try again.\n");
        }
    	else 
        	System.out.println("There was an error in your input, Please try again.\n");
      }
      while (scanOption == 1 || scanOption == 2 || scanOption != 3);
      System.out.print("---SHUTTING DOWN---");
   }
}
      while (scanOption < 3);
      System.out.print("---SHUTTING DOWN---");
   }
}
