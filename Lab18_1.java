import java.util.Scanner;

public class Lab18_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first side of the triangle: ");
		double side1 = in.nextDouble();
        System.out.print("Enter second side of the triangle: ");
    	double side2 = in.nextDouble();	
        System.out.print("Enter third side of the triangle: ");
		double side3 = in.nextDouble();

		System.out.print("Enter the color of the triangle: ");
		String color = in.next();

		System.out.print("Is the triangle filled?(Please type yes/no) ");
		boolean filled = in.nextBoolean();

		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);

		System.out.println(t.toString());
		System.out.println("Area: " + t.getArea());
		System.out.println("Perimeter: " + t.getPerimeter());
		System.out.println("Color: " + t.getColor());
		System.out.println("Triangle is" + (t.isFilled() ? "" : " not ") 
			+ "filled");
	}
}