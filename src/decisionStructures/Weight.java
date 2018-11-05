package decisionStructures;
import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		System.out.println("Pick a planet 1-5");
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. Mars");
		System.out.println("4. Jupiter");
		System.out.println("5. Saturn");
		int number = input.nextInt();
		switch(number) {
		case 1:
			System.out.println("Mercury");
			double weight2 = weight*0.37;
			System.out.println("Your weight would be " + weight2);
			break;
		case 2:
			System.out.println("Venus");
			 weight2 = weight*0.88;
			 System.out.println("Your weight would be " + weight2);
			 break;
		case 3:
			System.out.println("Mars");
			 weight2 = weight*0.38;
			 System.out.println("Your weight would be " + weight2);
			 break;
		case 4:
			System.out.println("Jupiter");
			 weight2 = weight*2.64;
			 System.out.println("Your weight would be " + weight2);
			 break;
		case 5:
			System.out.println("Saturn");
			 weight2 = weight*1.15;
			 System.out.println("Your weight would be " + weight2);
			 break;
		default:
			System.out.println("Your on earth dumby");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
