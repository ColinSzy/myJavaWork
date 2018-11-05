package decisionStructures;

import java.util.Scanner;

public class Promotion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("How many years of experience do you have?");
		double years = input.nextDouble();
		System.out.println("What is your height?");
		double height = input.nextDouble();

		if (age >= 50 && years == 10.5 && height < 70) {
			System.out.println("You get a Promotion!");
		} else {
			if (age >= 50 && years == 10.5 && height > 80) {
				System.out.println("You get a Promotion!");
			} else {
				if (age < 50 && height >= 70 || height < 81) {
					System.out.println("You get a Promotion!");
				} else {
					System.out.println("You Suck!");
					System.out.println("No promotion for you!");
				}

			}
		}
	}
}