package Lab23;
import java.util.Scanner;
public class Lab23_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = in.nextInt();
        


        System.out.println("The sum of the digits is: " + sumDigits(n));





        

    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
}
