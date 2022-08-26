public class Lab15_1 {

    public static void main(String[] args) {
            
            RegularPolygon regularPolygon1 = new RegularPolygon();
            RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
            RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
    
            
            
            
            System.out.println("Specifications of the first regular polygon: ");
            
		    System.out.println();
		    
		    System.out.println("The perimeter of polygon1 is "+regularPolygon1.getPerimeter());
            System.out.println("The area of polygon1 is "+regularPolygon1.getArea());

            System.out.println("Specifications of the second regular polygon: ");
            
		    System.out.println();
		    
		    System.out.println("The perimeter of polygon2 is "+regularPolygon2.getPerimeter());
            System.out.println("The area of polygon2 is "+regularPolygon2.getArea());

            System.out.println("Specifications of the third regular polygon: ");
            
		    System.out.println();
		    
		    System.out.println("The perimeter of polygon3 is "+regularPolygon3.getPerimeter());
            System.out.println("The area of polygon3 is "+regularPolygon3.getArea());
            
        }
}

public class RegularPolygon {
	
	private int n;
	private double s;
	private double x;
	private double y;

	
	RegularPolygon() {
		n = 3;
		s = 1;
		x = y = 0;
	}

	
	RegularPolygon(int newNumber, double newSide) {
		n = newNumber;
		s = newSide;
		x = y = 0;
	}

	
	RegularPolygon(int newNumber, double newSide, double newvalueX, double newvalueY) {
		n = newNumber;
		s = newSide;
		x = newvalueX;
		y = newvalueY;
	}

	
	public void setN(int newNumber) {
		n = newNumber;
	}

	
	public void setSide(double newSide) {
		s = newSide;
	}

	
	public void setX(double newvalueX) {
		x = newvalueX;
	}

	
	public void setY(double newvalueY) {
		y = newvalueY;
	}

	
	public int getN() {
		return n;
	}

	
	public double getSide() {
		return s;
	}

	
	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
	}

	
	public double getPerimeter() {
		return s * n;
	}

	
	public double getArea() {
		return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
	}
}

