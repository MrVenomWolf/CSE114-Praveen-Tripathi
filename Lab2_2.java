import java.util.Scanner;
public class Lab2_2 {

    public static void main(String [] args) {
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting velocity:- ");
        double v_0 = in.nextDouble();
        System.out.print("Enter the ending velocity:- ");
        double v_1 = in.nextDouble();
        System.out.print("Enter the time span:- ");
        double t = in.nextDouble();

        double area = (v_1 - v_0) / t;
        
        System.out.println("The average acceleration is " + String.format("%.4f",area));

        in.close();


    }
    
}
