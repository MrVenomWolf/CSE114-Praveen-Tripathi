import java.util.Scanner;
public class Lab5_1 {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value of a:- ");
        double a = in.nextDouble();
        System.out.print("Enter the value of b:- ");
        double b = in.nextDouble();
        System.out.print("Enter the value of c:- ");
        double c = in.nextDouble();

        double discriminant = Math.pow(b,2) - 4*a*c; 

        if (discriminant > 0) {
            double root_1 = (-b + Math.sqrt(discriminant))/(2*a);

            double root_2 = (-b - Math.sqrt(discriminant))/(2*a);

            System.out.print("The equation has two roots " + String.format("%.6f",root_1) + " and " + String.format("%.6f",root_2));

        } else if (discriminant == 0) {
            
            double root_one = -b/(2*a);
            System.out.print("The equation has only one root and it is " + String.format("%.6f",root_one));

        } else {

            System.out.print("The equation has no real roots.");

        }

        in.close();
        
        
        
        
        
    }
    

    
}
