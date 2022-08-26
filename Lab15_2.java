import java.util.Scanner;
public class Lab15_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a:- ");
        double a = in.nextDouble();
        System.out.print("Enter b:- ");
        double b = in.nextDouble();
        System.out.print("Enter c:- ");
        double c = in.nextDouble();
        System.out.print("Enter d:- ");
        double d = in.nextDouble();
        System.out.print("Enter e:- ");
        double e = in.nextDouble();
        System.out.print("Enter f:- ");
        double f = in.nextDouble();


        LinearEquation le = new LinearEquation(a, b, c, d, e, f);

        if (le.isSolvable()) {
            System.out.println("The equation has two solutions: " + String.format("%.2f", le.getX()) + " and " + String.format("%.2f", le.getY()));
        } else {
            System.out.println("The equation has no solutions.");
        }


        in.close();

      

    }
    
}

public class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getd() {
        return d;
    }

    public double gete() {
        return e;
    }

    public double getf() {
        return f;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - c * e) / (a * d - b * c);
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }
    
}

