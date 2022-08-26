import java.util.Scanner;

public class Lab10_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		
		System.out.print("Enter the number of rows: ");
		int rows = in.nextInt();
		
		displayPattern(rows);

        in.close();
	}

	
	public static void displayPattern(int n) {
		int pattern = n - 1;	
		
        for (int r = 1; r <= n; r++) {
			
			for (int m = 0; m < pattern; m++) {
				
                System.out.print("  ");
			}

			
			for (int i = r; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			
            pattern--; 
		}
	}
}