//Anubrota Majumdar, 114586887
import java.util.Scanner;

public class triangletype {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of side 1: ");
		
		int side1 = in.nextInt();
		
		System.out.print("Enter the value of side 2: ");
		int side2 = in.nextInt();
		
		System.out.print("Enter the value of side 3: ");
		int side3 = in.nextInt();
		
		if (side1 + side2 > side3) {
			
			if (side1 + side3 > side2) {
				
				if (side2 + side3 > side1) {
					
					if (side1 == side2 && side2 == side3 && side3 == side1) {
						
						System.out.println("This is an equilateral triangle!");
					
					} else if (side1 == side2 || side2 == side3 || side3 == side1 )
				        System.out.println("This is an isosceles triangle!");
					else {
						System.out.println("This is a scalene triangle!");
					}
				} else {
					System.out.println("This is an invalid input. Please Try again!");
				}
			}
			else {
				System.out.println("This is an invalid input. Please Try again!");
			}
		}
		else {
			System.out.println("This is an invalid input. Please Try again!");
		}

        in.close();
	}
}
	