package joans_workspace;
import java.lang.Math;
import java.util.Scanner;
public class MathTutor {
	public static void main(String []args) {
		int num1 = (int)(10 * Math.random() + 1);
		int num2 = (int)(10 * Math.random() + 1);
		int op = (int)(4 * Math.random() + 1);
		int answer;
		
		switch (op) {
		case 1: System.out.println("What is " + num1 + "+" + num2 + "?"); break;
		case 2: System.out.println("What is " + num1 + "-" + num2 + "?"); break;
		case 3: System.out.println("What is " + num1 + "/" + num2 + "?"); break;
		case 4: System.out.println("What is " + num1 + "*" + num2 + "?"); break;
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Answer: ");
		answer = input.nextInt();
		
		if (answer == num1 + num2 || answer == num1 - num2 || answer == num1 / num2 || answer == num1 * num2) {
			System.out.print("Correct!");
		} else {
			System.out.print("Try again.");
		}
		input.close();
	}

}
