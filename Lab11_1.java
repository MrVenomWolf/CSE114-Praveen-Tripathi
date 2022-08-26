import java.util.Scanner;
public class Lab11_1 {

    public static void main(String[] args) {
        System.out.print("Enter the 10 numbers here: ");
        Scanner in = new Scanner(System.in);

        double[] num = new double[10];

        for (int i = 0; i < 10; i++) {
            num[i] = in.nextDouble();
        }


        System.out.println("The mean is " + String.format("%.2f",mean(num)));
        System.out.println("The standard deviation is " + String.format("%.5f",deviation(num)));

        in.close();
    
   }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        
      }
    return sum / x.length;

    }
    

    public static double deviation(double[] x) {
        double mean = mean(x);
        double square = 0;
        for (int i = 0; i < x.length; i++) {
         square += Math.pow((x[i] - mean), 2);
        }
       
        return Math.sqrt(square / (x.length - 1));
    }
}


