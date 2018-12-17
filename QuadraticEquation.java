package joans_workspace;
import java.lang.Math;
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	int a;
	int b;
	int c;
	double root1;
	double root2;
	int discriminant;
	System.out.print("Enter the value for a: ");
	a = input.nextInt();
	System.out.print("Enter the value for b: ");
	b = input.nextInt();
	System.out.print("Enter the value for c: ");
	c = input.nextInt();
	
	discriminant = (b*b) - (4 * a * c);
	
	if (discriminant < 0) {
		System.out.print("There are no real roots");
    if (discriminant == 0) {
		root1 = (-b + Math.sqrt(b*b - 4 * a * c))/(2 * a);
		System.out.print("The root is " + root1);
	if (discriminant > 0) {
		root1 = (-b + Math.sqrt(b*b - 4 * a * c))/(2 * a);
		root2 = (-b - Math.sqrt(b*b - 4 * a * c))/(2 * a);
		System.out.print("The roots are: " + root1 + "and" + root2);
		input.close();
	}
	}
	{
	

	}
}
	}
}
