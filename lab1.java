import java.util.Scanner;		
public class lab1 {

	public static void main(String[] args) {
		double radius;
		double area;
		System.out.println("Enter the radius now:- ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();

		area = radius  * 3.14159;
		System.out.println("The area of the cirle" + " of radius "+ radius + " is " + area);

		input.close();
	 
		

	}

}
