import java.util.Scanner;
public class Lab4_1 {
    
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the balance:- ");
        double bal= in.nextDouble();
        System.out.print("Enter the interest rate:- ");
        double annual_rate = in.nextDouble();

        double interest = bal * (annual_rate/1200);

        System.out.print("The interest is " + String.format("%.5f",interest));

        in.close();
        
        
    }
}