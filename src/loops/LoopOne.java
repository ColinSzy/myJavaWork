package loops;
import java.util.Scanner;
public class LoopOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		
		
		int number = 0;
		System.out.println("How high do you want it to count");
		int high=input.nextInt();
		int sum=0;
		while (number <= high)
		{
			sum+=number;
			System.out.println(number);
			number+=2;
			
		}
		
		System.out.println(sum);
	}

}
