import java.util.Scanner;
public class Lab3_2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double wkg = in.nextDouble();
    System.out.print("Enter the initial temperature: ");
    double temp_1 = in.nextDouble();
    System.out.print("Enter the final temperature: ");
    double temp_2 = in.nextDouble();
    
    double q = wkg * ( temp_2 - temp_1) * 4184;

    System.out.print("The energy needed is " +q + " joules.");

    in.close();


    }


    
}
