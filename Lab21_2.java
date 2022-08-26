package Lab21;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;
public class Lab21_2 {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int[] arr = RandomArray();

        

        try {
            System.out.println("Enter the index of the array with 100: ");
            int index = in.nextInt();
            System.out.println("The element at index " + index + " is: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index is Out of bounds. Please try again.");
        }


        in.close();
        
    }

    public static int[] RandomArray() {
        int[] arr = new int[100];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    
}
