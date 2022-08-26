//Anubrota Majumdar ,114586887
import java.util.Scanner;
public class WindChill {
	
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the temperature between -58 Fahrenheit and 41 Fahrenheit: "); 
   		double temp = in.nextDouble();
	    
		System.out.print("Enter the wind speed which is greater than 2 mph in miles per hour: ");
	    double speed = in.nextDouble();

	    double wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

	    		
	    System.out.println("The wind chill index is " + wind_chill);

        in.close();


	    	
	}
     
		

}