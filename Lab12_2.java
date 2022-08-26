import java.util.*;
public class Lab12_2 {
    
    public static void main(String[] args)
    {
        double m[][]= new double[3][3];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the matrix row by row:- ");

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = in.nextDouble();


    System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix." : "It is not a Markov matrix.");

    in.close();
    } 

    public static boolean isMarkovMatrix(double[][] m) {

    for (int j = 0; j < m[0].length; j++) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {

            double num = m[i][j];
            if (num < 0) return false;
            sum += num;
        }
        
        if (sum != 1) return false;
    }

    return true;
    }


}

