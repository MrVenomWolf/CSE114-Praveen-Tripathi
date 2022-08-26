package HW5;
import java.util.Scanner;
public class Rational {

    
    private int num;
    private int den;

    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }
    public int getDen() {
        return den;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setDen(int den) {
        this.den = den;
    }
    public Rational add(Rational c) {
        Rational ans = new Rational(0, 0);
        ans.setNum(this.getNum() * c.getDen()+ this.getDen() * c.getNum());
        ans.setDen(this.getDen() * c.getDen());
        return ans;
    }
    public Rational subtract(Rational c) {
        Rational ans = new Rational(0, 0);
        ans.setNum(this.getNum() * c.getDen() - this.getDen() *  c.getNum());
        ans.setDen(this.getDen() * c.getDen());
        return ans;
    }

    public Rational multiply(Rational c) {
        Rational ans = new Rational(0, 0);
        ans.setNum(this.getNum() * c.getNum());
        ans.setDen(this.getDen() * c.getDen());
        return ans;
    }

    public Rational divide(Rational c) {
        Rational ans = new Rational(0, 0);
        ans.setNum(this.getNum() * c.getDen());
        ans.setDen(this.getDen() * c.getNum());
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numerator of the first rational number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the non-zero denominator of the first rational number: ");
        int den1 = in.nextInt();
        System.out.println("Enter the numerator of the second rational number: ");
        int num2 = in.nextInt();
        System.out.println("Enter the non-zero denominator of the second rational number: ");
        int den2 = in.nextInt();
        Rational r1 = new Rational(num1, den1);
        System.out.println("The first rational number is:" + r1.getNum() + "/" + r1.getDen());
        Rational r2 = new Rational(num2, den2);
        System.out.println("The second rational number is:" + r2.getNum() + "/" + r2.getDen());
        Rational r3 = r1.add(r2);
        System.out.println("The sum of the two rational numbers is: " + r3.getNum() + "/" + r3.getDen());
        Rational r4 = r1.subtract(r2);
        System.out.println("The difference of the two rational numbers is: " + r4.getNum() + "/" + r4.getDen());
        Rational r5 = r1.multiply(r2);
        System.out.println("The product of the two rational numbers is: " + r5.getNum() + "/" + r5.getDen());
        Rational r6 = r1.divide(r2);
        System.out.println("The quotient of the two rational numbers is: " + r6.getNum() + "/" + r6.getDen());

        in.close();

        
    }
    
}
