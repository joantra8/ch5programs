package joans_workspace;
import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		double squareRoot;
		int newResult;
		
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		input.close();
		
		squareRoot = Math.sqrt(number);
		newResult =(int)(squareRoot) * (int)(squareRoot);
		
		if (newResult == number) {
			System.out.print("The integer is a perfect square");
		} else {
			System.out.print("The integer is not a perfect square");
		}
	}

}
