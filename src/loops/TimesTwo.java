package loops;
import java.util.Scanner;
public class TimesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		while (number!=9999)
		{
			System.out.println("Pick a number");
			number = input.nextInt();
			number *= 2;
			System.out.println(number);
		}
		
		
		
		
		
		
		
	}

}
