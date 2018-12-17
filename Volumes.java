package joans_workspace;
import java.util.Scanner;
public class Volumes {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		System.out.print("Rectangular prism");
		System.out.print("Enter the length: ");
		length = input.nextDouble();
		System.out.print("Enter the width: ");
		width = input.nextDouble();
		System.out.print("Enter the height");
		height = input.nextDouble();
		System.out.print("The volume is: " + (length*width*height));
		
		double radius;
		System.out.print("Sphere");
		System.out.print("Enter the radius");
		radius = input.nextDouble();
		double diameter = radius*2;
		System.out.print("The volume is: " + (((Math.PI) * (Math.pow(diameter, 3)))/6));
		
		double side;
		System.out.print("Cube");
		System.out.print("Enter the length of each side: ");
		side = input.nextDouble();
		System.out.print("The volume is: " + (Math.pow(side, 3)));
		
		input.close();
		
	}

}
