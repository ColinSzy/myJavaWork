package decisionStructures;
import java.util.Scanner;
public class Age {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your age.");
	double age=input.nextDouble();
	System.out.println(age<21);
	}
}