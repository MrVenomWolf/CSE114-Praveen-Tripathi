// Anubrota Majumdar, 114586887
/*A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 +1.
Write a program that asks the user for an upper limit and prints all the perfect numbers up to that limit.
Example:
Enter the upper limit: 10000
The perfect numbers below 10000 are: 6 28 496 8128.
*/
import java.util.Scanner;
 
public class perfectnumber{
 
 public static void main(String[] args) {
 

      Scanner in = new Scanner(System.in);

       System.out.print("Enter the upper limit:- ");
       int n = in.nextInt();

    int sumOfDivisor = 0;
    

   System.out.print("The perfect numbers below " + n + " are ");
    for (int i = 1; i <= n; i++) 
    {
    for (int j = 1; j < i; j++) 
    {
      if (i % j == 0) {

      sumOfDivisor += j;

      in.close();
    }

   }
    if (sumOfDivisor == i) {

    System.out.print(i + " ");


   }
   sumOfDivisor = 0;
  }

  
 
 }
}
