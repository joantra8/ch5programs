package joans_workspace;
import java.util.Scanner;
import java.lang.Math;
public class MyPow {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		System.out.print("Enter the value for x: ");
		x = input.nextDouble();
		System.out.print("Enter the value for y: ");
		y = input.nextDouble();
		System.out.println("The result from using the formula is: " + Math.exp(y*Math.log(x)));
		System.out.println("The result from using the Math.pow() method is: " + Math.pow(x, y));
		
		input.close();
	}

}
