package decisionStructures;

import java.util.Scanner;

public class ShoeHeight {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is you shoe size?");
	double shoe = input.nextDouble();
	System.out.println("What is your height?");
	double height = input.nextDouble();
	
	System.out.println(height>62&&shoe>9 );
	
	
	
}
}