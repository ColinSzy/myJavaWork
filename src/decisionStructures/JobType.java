package decisionStructures;

import java.util.Scanner;

public interface JobType {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How much do you make in a year?");
		double salery = input.nextDouble();
		if (salery < 20000) {
			System.out.println("You must be a worker.");
			
		} else {
			if (salery < 40000) {
				System.out.println("You must be in management.");
				
			} else {
				if (salery < 100000) {
					System.out.println("You must be a CEO.");
					
				} else {
					if (salery > 100000) {
						System.out.println("You must be a owner.");
						
					}
				}
			}

		}
	}
}
