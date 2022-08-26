import java.util.Scanner;
public class Lab10_2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the integer you want to reverse:- ");
        int n = in.nextInt();

        reverse(n);

     

        in.close();

    }

    public static void reverse(int n) {

        System.out.print("The reverse of " + n + " is: ");
		while (n > 0) {

			System.out.print((n % 10));
			n /= 10;

		}

        System.out.println();
        
		
	}
}