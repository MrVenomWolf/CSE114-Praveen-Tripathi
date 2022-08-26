package Lab21;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab21_1  {

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        
        while (true) {
            try{
                System.out.println("Enter the first integer: ");
                int a = in.nextInt();
                System.out.println("Enter the second integer: ");
                int b = in.nextInt();

                System.out.println("The sum of the two integers is: " + (a + b));
                                
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input.Please enter an Integer and try again.");
                in.nextLine();
            }

            in.close();
        

        
            

        }
        
                   
        


        
    }
    
}
