
public class Lab8_1 {

    public static void main(String [] args) {

        double sum = 0;
		
        for (double n = 1; n <= 97; n += 2) {
			sum += n / (n + 2);
		
        }

		System.out.println("Sum of series:- " + sum);
    }
    
}
