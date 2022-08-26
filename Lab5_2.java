import java.util.Scanner;
public class Lab5_2 {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the weight of the package you want to ship:- ");
        double w = in.nextDouble();

        if ( w <= 0 ) {
            System.out.print("Invalid weight.");
        
        } else if ( w > 0 && w <= 1) {
            System.out.print("The cost of shipping is $3.50.");

        } else if ( w > 1 && w <= 3) {
            System.out.print("The cost of shipping is $5.50.");

        } else if ( w > 3 && w <= 10) {
            System.out.print("The cost of shipping is $8.50.");
        
        } else if ( w > 10 && w <= 20) {
            System.out.print("The cost of shipping is $10.50.");
        
        
        } else if ( w > 20) {
            System.out.print("This package cannot be shipped.");
        
        }

        in.close();

    }
    
}
