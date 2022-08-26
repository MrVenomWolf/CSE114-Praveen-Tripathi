import java.util.Scanner;
public class Lab9_1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string:- ");
       
        String s = in.nextLine();
        
        System.out.print("Enter the character you want to find:- ");
        char ch = in.next().charAt(0);

        System.out.println("The number of occurrences of " + ch +" in the word " + s + " is " + count(s,ch) + ".");

        in.close();
    } 

    public static int count(String str, char a) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) count++;
        }

        return count;

        
    } 
}