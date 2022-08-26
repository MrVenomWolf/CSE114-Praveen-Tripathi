
//Anubrota Majumdar ,114586887
import java.util.Scanner;
public class eggs {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("The number of the eggs in order:- ");
		int egg_num = in.nextInt();
		
		int doz = egg_num / 12;
		int rem = egg_num % 12;
        
        double total = doz * 3.25 + rem * 0.45;
		
        System.out.println("You ordered " + egg_num + " eggs.");
        System.out.println("That's " + doz + " dozen at $3.45 per dozen and " + rem + " loose eggs at 45 cents for a total of $ " + total + ".");


        in.close();

	}

}