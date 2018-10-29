package decisionStructures;

import java.util.Scanner;

public class Honors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("What grade are you in?");
		double grade = input.nextDouble();
		
		if(gpa>=3.5&&grade==12.0) {
			System.out.println("Nice Job!");
		}
		else
		{
			System.out.println("You should try harder!");
		}
		
		
		
		
		
	}
}
