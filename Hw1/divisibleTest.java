//Anubrota Majumdar ,114586887
import java.util.Scanner;

public class divisibleTest {

    public static void main(String [] args) {
        Scanner in =  new Scanner(System.in);
        
        System.out.print("Enter the integer:- ");
        int n = in.nextInt();

        System.out.println("Is " + n + " divisible by 5 and 6? " + (( n % 5 == 0) &&  (n % 6 == 0)));
        System.out.println("Is "+ n + " divisible by 5 or 6? " + (( n % 5 == 0) ||  (n % 6 == 0)));
        System.out.println("Is "+ n + " divisible by 5 or 6, but not both? " + (( n % 5 == 0) ^  (n % 6 == 0)));

        in.close();

    }

}
