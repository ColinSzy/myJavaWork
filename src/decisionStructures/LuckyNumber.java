package decisionStructures;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is your age?");
		double age = input.nextDouble();
		if(age>=18) {
			System.out.println("What is your height");
			double height = input.nextDouble();
			System.out.println("What is your weight");
			double weight = input.nextDouble();
			double number = (height/5.0)*age+weight;
			System.out.println("Your Number is: " + number);
		}
		else
		{
			System.out.println("What is your height");
			double height = input.nextDouble();
			System.out.println("What is your weight");
			double weight = input.nextDouble();
			double number = (weight/2)*age+height;
			System.out.println("Your Number is: " + number);
		}
		
		
		
		
	}
}
