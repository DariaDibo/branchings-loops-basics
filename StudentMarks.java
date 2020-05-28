package MyFirstJavaProject;

import java.util.Scanner;

public class StudentMarks {
	
	public static void main (String[] args) {
				
/*		boolean firstMark;
		boolean secondMark;
		boolean exMark;
		
		double firstValidMark;
		double secondValidMark;
		int examValidMark;
				
		do {
			System.out.print("Input the first semester mark: ");
			
			Scanner inputFirstValue = new Scanner (System.in);
			double firstSemesterMark = inputFirstValue.nextDouble();
			
			if ((firstSemesterMark >= 0.01)&&(firstSemesterMark <= 10.00)) {
				
				System.out.println("The first semester mark is: " + firstSemesterMark);
				firstMark = true;
				firstValidMark = firstSemesterMark;
				
				if (firstMark = true) {
					break;
				}
			
			} else {
				
				System.out.println("Your entry " + firstSemesterMark + " is not valid. The value must be a comma separated number between 0 and 10. Please enter a valid first semester mark.");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
				firstMark = false;
				
			}
		} 
		
		while (firstMark = true);
		System.out.println("=================================================================================================================================================================");
		
		do {
			System.out.print("Input the second semester mark: ");
			
			Scanner inputSecondValue = new Scanner (System.in);
			double secondSemesterMark = inputSecondValue.nextDouble();
			
			if ((secondSemesterMark >= 0.01)&&(secondSemesterMark <= 10.00)) {
				
				System.out.println("The second semester mark is: " + secondSemesterMark);
				secondMark = true;
				secondValidMark = secondSemesterMark;
				
				if (secondMark = true) {
					break;
				}
			
			} else {
				
				System.out.println("Your entry " + secondSemesterMark + " is not valid. The value must be a comma separated number between 0 and 10. Please enter a valid second semester mark.");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
				secondMark = false;
			}
		} 
		
		while (secondMark = true);
		System.out.println("=================================================================================================================================================================");
		
		do {
			System.out.print("Input the exam mark: ");
			
			Scanner inputExamValue = new Scanner (System.in);
			int examMark = inputExamValue.nextInt();
			
			if ((examMark >= 0.01)&&(examMark <= 10.00)) {
				
				System.out.println("The exam mark is: " + examMark);
				exMark = true;
				examValidMark = examMark;
				
				if (exMark = true) {
					break;
				}
			
			} else {
				
				System.out.println("Your entry " + examMark + " is not valid. The value must be an integer number between 0 and 10. Please enter a valid exam mark.");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
				exMark = false;
				
			}
		} 
		
		while (exMark = true);
		System.out.println("=================================================================================================================================================================");*/
		
		int firstSemesterMark = 10;
		int secondSemesterMark = 10;
		int examMark = 10;
		
		boolean firstMark;
		boolean secondMark;
		boolean exMark;
		
		float finalMark = (float) ((firstSemesterMark + secondSemesterMark) * 0.2f + (float) examMark * 0.6f);
		
		if ((firstSemesterMark >= 0.01)&&(firstSemesterMark <= 10.00)) {
			
			System.out.println("The first semester mark is: " + firstSemesterMark);
			firstMark = true;
					
		} else {
			
			System.out.println("Your entry [" + firstSemesterMark + "] is not valid. The value must be between 1 and 10. Please enter a valid first semester mark.");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			firstMark = false;
		}
		
		System.out.println("=================================================================================================================================================================");
		
		if ((secondSemesterMark >= 0.01)&&(secondSemesterMark <= 10.00)) {
				
			System.out.println("The second semester mark is: " + secondSemesterMark);	
			secondMark = true;
			
		} else {
				
				System.out.println("Your entry [" + secondSemesterMark + "] is not valid. The value must be between 1 and 10. Please enter a valid second semester mark.");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				secondMark = false;
			}
		
		System.out.println("=================================================================================================================================================================");
			
		if ((examMark >= 0.01)&&(examMark <= 10.00)) {
				
			System.out.println("The exam mark is: " + examMark);
			exMark = true;
			
		} else {
				
			System.out.println("Your entry [" + examMark + "] is not valid. The value must be between 1 and 10. Please enter a valid exam mark.");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			exMark = false;
			
			}

		System.out.println("=================================================================================================================================================================");
		
		System.out.println("*****************************************************************************************************************************************************************");
		
		if ((firstMark == true) && (secondMark == true) && (exMark == true)) {
			
			System.out.println("Your final mark is: " + finalMark);
			
		} else {
			
			System.out.println("Error! Invalid entry / entries. The final mark cannot be calculated. Please check your entries and try again.");
			
		}
		
		System.out.println("*****************************************************************************************************************************************************************");
		
		if ((finalMark >= 1.0) && (finalMark < 5.0)) {
			System.out.println("Very weak...you have to repeat the course.");
		} else if ((finalMark >= 5.0) && (finalMark < 7)) {
			System.out.println("You may continue studying, but you have to work harder!");
		} else if ((finalMark >= 7.0) && (finalMark < 9.0)) {
			System.out.println("Not bad, but you have what to strive for...");
		} else if ((finalMark >= 9.0) && (finalMark < 10.0)) {
			System.out.println("Congratulations! You are a good student, continue studying the same way!");
		} else {
			System.out.println("Excelent! You are the best student!");
		}
		
		System.out.println("*****************************************************************************************************************************************************************");}

}
