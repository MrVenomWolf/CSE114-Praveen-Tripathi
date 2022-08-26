package HW5;


public class Circle2D {
	private double x;
	private double y;
	private double r;
	
	public double getx() {
		return this.x;
		
	}
	public double gety() {
		return this.y;
		
	}
	public double getr() {
		return this.r;
		
	}
	
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.r = 1;
		
	}
	public Circle2D(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
    
	public double getarea() {
		return Math.PI * Math.pow(r, 2);
		
	}
	public double getperimeter() {
		return Math.PI * 2 * r;
	}
	
	public boolean contains(double x, double y) {
		boolean xvalid = x <= this.x + this.r && x >= this.x - this.r;
		boolean yvalid = y <= this.y + this.r && y >= this.y - this.r;
		return xvalid && yvalid;
		
	}
	
	public boolean contains(Circle2D circle) {
		boolean xvalid = circle.getx() + circle.getr() <= this.x + this.r && circle.getx() - circle.getr() >= this.x - this.r;
		boolean yvalid = circle.gety() + circle.getr() <= this.y + this.r && circle.gety() - circle.getr() >= this.y - this.r;
		return xvalid && yvalid;
		
	}
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(this.getx() - circle.getx(), 2) + Math.pow(this.gety() - circle.gety(), 2));
		return circle.getr() + this.getr() <= distance;
		
		
	}
	
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("The area of the circle is: " + c1.getarea());
		System.out.println("The perimeter of the circle is: " + c1.getperimeter());

		System.out.println("Does the circle contain the circle centered at point (3, 3)? " + c1.contains(3, 3));
		System.out.println("Does the circle contain the circle centered at point (4, 5) with radius 10.5? " + c1.contains(new Circle2D(4, 5, 10.5)));

		System.out.println("Does the circle overlap the circle centered at point (3, 5) with radius 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));

		

	}
	
	
	
	
	















}


