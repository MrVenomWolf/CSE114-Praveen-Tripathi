import java.util.Scanner;

public class Lab14_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a:- ");
        double a = in.nextDouble();
        System.out.print("Enter b:- ");
        double b = in.nextDouble();
        System.out.print("Enter c:- ");
        double c = in.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        System.out.print("The equation has ");
		
        if (qe.getDiscriminant() < 0)
			System.out.println("no real roots");

		else if (qe.getDiscriminant() > 0) {
			System.out.println("two roots " + String.format("%.5f",qe.getRoot_1()) + " and " + String.format("%.5f",qe.getRoot_2()));
		}

		else {
			System.out.println("one root " + String.format("%.5f",qe.getRoot_1() > 0 ? qe.getRoot_1() : qe.getRoot_2()));


        }
        in.close();
                
    }
    
}

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double geta() {
        return a;
    }

    
    public double getb() {
        return b;
    }

    
    public double getc() {
        return c;
    }

    
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    
    public double getRoot_1() {
        return getDiscriminant() < 0 ? 0 :
            ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    
    public double getRoot_2() {
        return getDiscriminant() < 0 ? 0 :
            ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}



