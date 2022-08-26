// Anubrota Majumdar, 114586887
/*
Write a program that prompts the user to enter two strings and display the largest common prefix of the two strings. If there are no common prefix between the two entered strings display a message which tells the user that the two string doesn’t have a common prefix.
Examples:
Enter the first string: Atlanta
Enter the second string: Macon
Atlanta and Macon have no common prefix.
Enter the first string: Welcome to Java
Enter the second string: Welcome to programming
The common prefix is: Welcome to
Note: The prefix actually includes the space after ‘to’ as well
Enter the first string: I love coffee
Enter the second string: I love Java
The common prefix is I love
*/
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


