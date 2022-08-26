import java.util.Scanner;
public class HW4_4 {

	public static double[][] multiplymatrices(double [][] a, double [][] b) {
	int row1 = a.length;
	int row2 = b.length;
	
	int col1 = a[0].length;
	int col2 = b[0].length;
	
	if(col1 != row2) {
		return null;
	}
	double result[][] = new double [row1][col2];
	
	for(int i = 0; i < row1 ; i++) {
	for(int j = 0; j < col2 ; j++) {
	for(int k = 0; k < col1 ; k++) {
		
		result[i][j] += (a[i][k] * b[k][j]);
		
	}
	}
	}
	

return result;
}
	static void readMatrix(double mtx[][]) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < mtx.length; i++) {
			for ( int j = 0; j < mtx.length;j++) {
				
				mtx[i][j]= in.nextDouble();
				
			}
		}
		
	}
	static void printMatrix (double mtx[][]) {
		
		for(int i = 0; i < mtx.length; i++) {
			for(int j = 0; j < mtx[0].length; j++) {
		
				System.out.printf("%5.2f", mtx[i][j]);


                    

			
				
			}
			System.out.println();
			
		}
	}
	public static void main( String[] args) {
		double a[][] = new double [3][3];
		double b[][] = new double[3][3];
		
		System.out.println("Enter the first matrix(3X3): ");
		
		readMatrix(a);
		
		System.out.println("Enter the second matrix(3X3): ");
		
		readMatrix(b);
		
		double c[][] = multiplymatrices(a,b);
		
		System.out.println("Product of the two matrices: ");
		
		printMatrix(c);
		
	
	}	
}