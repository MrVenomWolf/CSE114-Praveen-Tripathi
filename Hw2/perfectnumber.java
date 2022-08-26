// Anubrota Majumdar, 114586887
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