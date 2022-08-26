import java.util.Scanner;
public class Lab3_1 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Celsius degree:- ");
        double cel = input.nextDouble();

        double fah = (9.0/5) * cel + 32;

        System.out.print(cel + " Celcius is " + fah + " Fahrenheit.");

        input.close();

    }
    
}
