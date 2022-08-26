// Anubrota Majumdar, 114586887
import java.util.Scanner;

public class largestcommonprefix {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first string here: ");
		String string_1 = in.nextLine();
		
		System.out.print("Enter the second string here: ");
		String string_2 = in.nextLine();

		int index = 0;				
		String prefix = "";		
		
		while (string_1.charAt(index) == string_2.charAt(index)) {
			prefix += string_1.charAt(index);
			index++;
		}
		
		if (prefix.length() > 0)
			
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(string_1 + " and " + string_2 + " have no commmon prefix");


		in.close();
	
	}

	
}


