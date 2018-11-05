package decisionStructures;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess the magic number 0-100" );
		int number = input.nextInt();
		if (number==10)
		{
			System.out.println("You Won A Lambo");
		}
		else
		{
		System.out.println("Sorry you lost");
		System.out.println("TAKE THE L!");
		}
		
	}

}
