package loops;
import java.util.Scanner;
public class DoubleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double value = 0;
		double count = 0;
		double avg = 0;
		while (value != 9999.99)
		{
			System.out.println("Enter a Value (Enter 9999.99 to stop)");
			value += input.nextDouble();
			count += 1;
		}
		value -= 9999.99;
		avg = value/count;
		System.out.println("Average:" + avg);
		
		
		
		
		
		
		
		
	}

}
