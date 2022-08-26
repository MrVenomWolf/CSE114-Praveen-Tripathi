package HW5;
import java.util.Scanner;
public class Complex {

    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c) {
        Complex result = new Complex(0, 0);
        result.setRealPart(this.getRealPart() + c.getRealPart());
        result.setImaginaryPart(this.getImaginaryPart() + c.getImaginaryPart());
        return result;
    }

    public Complex subtract(Complex c) {
        Complex result = new Complex(0, 0);
        result.setRealPart(this.getRealPart() - c.getRealPart());
        result.setImaginaryPart(this.getImaginaryPart() - c.getImaginaryPart());
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number: ");
        double realPart1 = in.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginaryPart1 = in.nextDouble();
        System.out.println("Enter the real part of the second complex number: ");
        double realPart2 = in.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginaryPart2 = in.nextDouble();
        Complex c1 = new Complex(realPart1, imaginaryPart1);
        System.out.println("The first complex number is:" +"("+ c1.getRealPart() + ", " + c1.getImaginaryPart() + ")");
        Complex c2 = new Complex(realPart2, imaginaryPart2);
        System.out.println("The second complex number is:" +"("+ c2.getRealPart() + ", " + c2.getImaginaryPart() + ")");
        Complex c3 = c1.add(c2);
        System.out.println("The sum of the two complex numbers is: " +"("+ c3.getRealPart() + ", " + c3.getImaginaryPart() + ")");
        Complex c4 = c1.subtract(c2);
        System.out.println("The difference of the two complex numbers is: " +"("+ c4.getRealPart() + ", " + c4.getImaginaryPart() + ")");

        in.close();
    }







    
    
}
