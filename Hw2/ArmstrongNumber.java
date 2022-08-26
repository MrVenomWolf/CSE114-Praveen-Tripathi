// Anubrota Majumdar, 114586887
/*
An Armstrong number is an n-digit integer such that the sum of the 𝑛𝑡ℎ power of its digits is equal to the number itself. For example, 371 is an Armstrong number because 33+73+13=371 (371 is a 3-digit number). 8208 is an Armstrong number because 84+24+04+84=8208 (8208 is a 4-digit number).
Write a program that asks the user for a lower limit and an upper limit and prints all the Armstrong numbers up to that limit.
Example:
Enter the lower limit: 10
Enter the upper limit: 1000
The Armstrong numbers between 10 and 1000 are: 153 370 371 407
*/
import java.util.Scanner;
public class ArmstrongNumber {
	
  public static void main(String args[]) {
    	
	long num, low, upper, i, rem, temp, counter=0;
		
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the lower limit: ");
	
	low = in.nextInt();
	System.out.print("Enter the upper limit: ");
	
	upper = in.nextInt();
	in.close();

	
	for(i = low+1; i < upper; i++)
	{
	   temp = i;
	   num = 0;
    int count = 0;
    while(temp != 0)
	   {
		  rem = temp%10;
		  temp = temp/10;
       count++;
	   }
    temp = i;
	   while(temp != 0)
	   {
		rem = temp%10;
    long ans = 1;
    for(int j = 0; j < count; j++)
      {
        ans = ans * rem;
      }
		num = num + ans;
		temp = temp/10;
	   }

	   if(i == num)
	   {
		if(counter == 0)
		{
		   System.out.print("The Armstrong Numbers between "+low+" and "+upper+" are: ");
		}
		   System.out.print(i + "  ");
		   counter++;
	   }
	}
	
	if(counter == 0)
	
	{
	
		System.out.print("There is no Armstrong number between "+low+" and "+upper);
	
	}
    }
}
