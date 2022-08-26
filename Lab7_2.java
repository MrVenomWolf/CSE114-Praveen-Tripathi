import java.util.Scanner;

public class Lab7_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = in.nextLine();

		if(ssn.length() == 11) {

            if(Character.isDigit(ssn.charAt(0))
            
                    && Character.isDigit(ssn.charAt(1))
                    && Character.isDigit(ssn.charAt(2))
                    && ssn.charAt(3) == '-'
                    
                    && Character.isDigit(ssn.charAt(4))
                    && Character.isDigit(ssn.charAt(5))
                    && ssn.charAt(6) == '-'
                    
                    && Character.isDigit(ssn.charAt(7))
                    && Character.isDigit(ssn.charAt(8))
                    && Character.isDigit(ssn.charAt(9))
                    && Character.isDigit(ssn.charAt(10)))

                System.out.println(ssn + " is a valid social security number.");
            else
                System.out.println(ssn + " is an invalid social security number.");
        }
        else
            System.out.println(ssn + " is an invalid social security number.");

        in.close();
    }
}
