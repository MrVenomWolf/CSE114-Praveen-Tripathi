/*
Write a method that parses a binary number as a string and converts it into a decimal integer. The method header is:
public static int bin2Dec(String binaryString)
Write a test program that prompts the user to enter a binary number as a string and displays its decimal equivalent.
*/
import java.util.Scanner;
public class decimaltobinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int value = in.nextInt();

        System.out.println("The binary output of " + value + " is: " + dec2Bin(value));

        in.close();

    }

    public static String dec2Bin(int value) {
        StringBuilder s1 = new StringBuilder();
        
        while (value > 0) {
            s1.append(value % 2);
            value = value / 2;
        }
        return s1.reverse().toString();
    }

   


    
}
