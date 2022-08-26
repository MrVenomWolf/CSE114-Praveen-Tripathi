public class Lab14_1 { 

	public static void main(String[] args) {
		 
		Rectangle rectangle1= new Rectangle(4, 40);
		Rectangle rectangle2= new Rectangle(3.5,35.9);
	
		System.out.println("Specifications of the first rectangle: ");
		System.out.println();
		System.out.println("The Width of rectangle1 is "+rectangle1.getwidth());
		System.out.println("The height of rectangle1 is "+rectangle1.getheight());
		System.out.println("The area of rectangle1 is "+rectangle1.getarea());
		System.out.println("The perimeter of rectangle1 is "+rectangle1.getperimeter());

		System.out.println();
		System.out.println();


		System.out.println("Specifications of the second rectangle: ");
		System.out.println();
		System.out.println("The Width of rectangle2 is "+rectangle2.getwidth());
		System.out.println("The height of rectangle2 is "+rectangle2.getheight());
		System.out.println("The area of rectangle2 is "+ String.format("%.2f",rectangle2.getarea()));
		System.out.println("The perimeter of rectangle2 is "+rectangle2.getperimeter());
	
		
				
	}
	
	   public static class Rectangle{
        
        
        private double width=1;
		private double height =1;
		
     	public Rectangle(double width, double height) {
			this.width=width;
			this.height=height;	
		}
		
		public double getwidth() {
			return width;
		}
		
		public double getheight( ) {
			return height;	
		}
	
		
		public void setwidth(double width) {
			this.width = width;
		}
		
		public void setweight(double height) {
			this.height = height;
		}
		
			
		public double getarea() {
			return width*height;	
		}
		
		public double getperimeter() {
			return 2*(width + height);
		}
	
	}
			
			
}