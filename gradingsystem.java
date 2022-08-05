/*DESIGN
 * PROBLEM STATEMENT: A java code to calculate student GPA & CGPA
 * VARIABLES:
 * 			integer n : (number of semesters done) (input)
 * 			integer x : (number of courses taken in a particular semester) (input)
 * 			integer i : current semester being analysed ()
 * 			integer b : current course being analysed()
 * 			double score (input)
 * 			double units (input)
 * 			char grade (output)
 * 			double credits (output)
 * 			double creditUnits (output)
 * 			double TotalCreditUnits (output)
 * 			double TotalUnits (output)
 * 			double GPA (output)
 * 			double SumTotalCreditUnits (output)
 * 			double SumTotalUnits (output)
 * 			double CGPA (output)
 * ALGORITHM:
 * STEP 1: START
 * STEP 2: initialise TotalCreditUnits, TotalUnits, SumTotalCreditUnits, SumTotalUnits all equal 0
 * STEP 3: declare all other variables
 * STEP 4: Ask user to input n
 * STEP 5: for i = 1, ask user to input x
 * STEP 6: for b = 1, ask user to input score
 * STEP 7: if score >= 70, grade = 'A', go to STEP 12. else
 * STEP 8: if score >= 60, grade = 'B', go to STEP 12. else
 * STEP 9: if score >= 50, grade = 'C', go to STEP 12. else
 * STEP 10:if score >= 40, grade = 'D', go to STEP 12. else
 * STEP 11:if score < 40, grade = 'F'
 * STEP 12:if grade == 'A', credits = 4, go to STEP 17. else
 * STEP 13:if grade == 'B', credits = 3, go to STEP 17. else
 * STEP 14:if grade == 'C', credits = 2, go to STEP 17. else
 * STEP 15:if grade == 'D', credits = 1, go to STEP 17. else
 * STEP 16:if grade == 'F', credits = 0
 * STEP 17:Ask user how many units the course is
 * STEP 18:creditUnits = credit * units
 * STEP 19:TotalCreditUnits = TotalCreditUnits + creditUnits
 * STEP 20:TotalUnits = TotalUnits + units
 * STEP 21:b = b + 1
 * STEP 22:Repeat from STEP 6 till b = x
 * STEP 23:GPA = TotalCreditUnits/TotalUnits
 * STEP 24:SumTotalCreditUnits = SumTotalCreditUnits + TotalCreditUnits
 * STEP 25:SUmTotalUnits = SumTotalUnits + TotalUnits
 * STEP 26:Display the student's GPA for the current semester
 * STEP 27:i = i + 1
 * STEP 28:Repeat from STEP 5 till i = n
 * STEP 29:CGPA = SumTotalCreditUnits/SUmTotalUnits
 * STEP 30:Display the student's CGPA
 * STEP 31:STOP
 */

package classStuff;

import java.util.Scanner;

public class GradingSystem {
	
	//declaring all the variables to be used
	static double TotalCreditUnits = 0, TotalUnits = 0, SumTotalCreditUnits = 0, SumTotalUnits = 0;
	static double credits, units, creditUnits;
	static int i, b, n, x;
	static char grade ;
	static double score, GPA, CGPA;
	
	static Scanner input = new Scanner(System.in);
	
	//creating a method to determine how many semesters a student has done so far
	public static void semesters() {
		System.out.println("How many semesters have you done so far in this institution");
		n = input.nextInt();
	}
	
	//method to find out how many courses the student took in a semester
	public static void courses() {
		System.out.println("How many courses did you take in semester " + i);
		x = input.nextInt();
	}
	
	//method that assigns grades for each course based on the student's score
	public static void grade() {
		System.out.println("Please what was your score for course " + b);
		score = input.nextDouble();
		if (score >= 70) {
			grade = 'A';
		}
		else if (score >= 60) {
			grade = 'B';
		}
		else if (score >= 50) {
			grade = 'C';
		}
		else if (score >= 40) {
			grade = 'D';
		}
		else grade = 'F';
	}
	
	//using grades to assign credit scores on a 4-point scale i.e. from 0-4
	public static void credits() {
		switch (grade) {
		case 'A':
			credits = 4;
			break;
		case 'B':
			credits = 3;
			break;
		case 'C':
			credits = 2;
			break;
		case 'D':
			credits = 1;
			break;
		case 'F':
			credits = 0;
			break;
		}
	}
	
	//method for calculating a student's credit units for the semester
	public static void CreditUnits() {
		System.out.println("How many units is this course?");
		units = input.nextDouble();
		creditUnits = credits * units;
		TotalUnits += units;
		TotalCreditUnits += creditUnits;
	}
	
	/*a new method to calculate GPA for the current semester, 
	 * as well as sum of the total credit units from the first to current semester
	 * and the sum of the total credit units from first to current semester
	 * also displays the GPA for current semester after formatting to 2 decimal places
	 */
	public static void GPA() {
		GPA = TotalCreditUnits/TotalUnits;
		SumTotalCreditUnits += TotalCreditUnits;
		SumTotalUnits += TotalUnits;
		System.out.printf("Your GPA for semester " + i + " is %.2f%n", + GPA);
		System.out.println();
	}
	
	/* a new method to calculate a student's CGPA
	 * and display the value in 2 decimal places
	 */
	public static void CGPA() {
		CGPA = SumTotalCreditUnits/SumTotalUnits;
		System.out.printf("Your CGPA is %.2f%n", + CGPA);
	}
	
	public static void main(String[] args) {
		semesters();
		for(i=1; i<=n; i++) {
			courses();
			for (b=1; b<=x; b++) {
				grade();
				credits();
				CreditUnits();
			}
			GPA();
		}
		CGPA();
	}
	
}
