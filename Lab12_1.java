import java.util.Scanner;
public class Lab12_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array:- ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        
        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
             array[i][j] = in.nextDouble();
            }
        }

        int[] location = theLargest(array);
        System.out.printf("The location of the largest element is (%d,%d)",location[0], location[1]);

        in.close();
    }

    public static int[] theLargest(double[][] p) {
        int[] location = new int[]{0,0};
        
        double largest = p[0][0];
        for (int i = 0; i < p.length; i++) {
            
            for (int j = 0; j < p[i].length; j++) {
                
                if (largest < p[i][j]) {
                    largest = p[i][j];
                    
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }


}