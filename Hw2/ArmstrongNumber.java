// Anubrota Majumdar, 114586887
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