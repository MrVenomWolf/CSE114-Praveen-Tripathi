// Anubrota Majumdar, 114586887
/*
Write a method that checks whether the input string or a sentence (a string with spaces) is a palindrome or not. The method should be case insensitive and should ignore spaces. Write a test program that prompts the user to input a string and invokes this method. Some example runs are:
Enter the input string: madam
Input string madam is a palindrome
Enter the input string: banana
Input string banana is NOT a palindrome
Enter the input string: Race Car
Input string Race Car is a palindrome
Enter the input string: Too HOT to hoot
Input string Too HOT to hoot is a palindrome
*/
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        System.out.print("Enter a string:- ");
		String str = in.nextLine();
		
		int backIndex = str.length() - 1;
		
		boolean isPalindrome = true;
		
		for (int i = 0; i < str.length() / 2; i++) {
			
            if (str.charAt(i) != str.charAt(backIndex)) {
				isPalindrome = false;
			    break;
			}
			
            backIndex--;
			
		}
		
		if (isPalindrome) System.out.println("Input string " + "\"" + str + "\"" +" entered is a palindrome.");
		
        else System.out.println("Input string " + "\"" + str + "\"" + " entered is NOT a palindrome. Please try again.");


        in.close();
		
		

	}

}
