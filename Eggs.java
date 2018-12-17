package joans_workspace;
import java.util.Scanner;
import java.text.NumberFormat;
public class Eggs {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		int eggs;
		System.out.print("Enter number of eggs purchased: ");
		eggs = input.nextInt();
	
		
		int dozens = eggs/12;
		int extras = eggs%12;
		
		if (eggs >= 132) {
			System.out.print("The bill is equal to: " + money.format((double)((dozens * .35) + (extras * .175))));
		} else if (dozens >= 72) {
			System.out.print("The bill is equal to: " + money.format((double)((dozens * .4) + (extras * .2))));
		} else if (dozens >= 48) {
			System.out.print("The bill is equal to: " + money.format((double)((dozens * .45) + (extras * .225))));
		} else {
			System.out.print("The bill is equal to: " + money.format((double)((dozens * .5) + (extras * .25))));
			
			input.close();
		}
		}
	{

		
		
		
		
       
		
		
		
		
			
		}
		
	{
}
		
{
		
		
	}

}

