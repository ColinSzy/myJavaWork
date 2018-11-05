package decisionStructures;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double number = Math.sqrt(84.3);

		System.out.println("How much money did you get on your 5th birthday?");
		double money = input.nextDouble();

		if (Math.abs(number - money) <= 0.01) {
			System.out.println("Yeet Yeet, you won a good prize!");
		} else {
			System.out.println("You Suck!");

		}

	}

}
