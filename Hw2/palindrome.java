// Anubrota Majumdar, 114586887
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