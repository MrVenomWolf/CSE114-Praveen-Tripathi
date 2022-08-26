import java.util.Scanner;
public class Lab13_2 {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        double [][] m = new double[4][4];

        System.out.println("Enter the elements of a 4-by-4 matrix row by row:- ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextDouble();
            }
        }

        System.out.println("The sum of the elements in the major diagonal is " + String.format("%.1f",sumMajorDiagonal(m)) );

        in.close();

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            if ( i < m[0].length)
            sum += m[i][i];
        }
        
        return sum;
    }
    
}
