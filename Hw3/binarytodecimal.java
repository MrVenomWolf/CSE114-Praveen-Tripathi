/*
Write a method that converts a decimal number into a binary number as a string. The method header is:
public static String dec2Bin(int value)
Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
*/
import java.util.Scanner;
public class binarytodecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary string: ");
        String binaryString = in.nextLine();

        System.out.println("The decimal output of " + binaryString + " is: " + bin2Dec(binaryString));

        in.close();

    }

    public static int bin2Dec(String binaryString) {
        int decimal_value = 0;
        int pow = 0;
        
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            
            if (binaryString.charAt(i) == '1') {
                decimal_value += Math.pow(2, pow);
            }
            
            pow++;
        }
        return decimal_value;
    }



    
}
