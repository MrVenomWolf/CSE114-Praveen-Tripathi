
import java.util.Scanner;

public class HW4_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		 

		
		System.out.print("Enter the ten strings: ");
        String s = "";

        s = input.nextLine();
		String[] array = s.split(",");

        for(int p = 0; p < array.length;p++){
            array[p] = array[p].trim();
        }

		
		bubbleSort(array);

		System.out.println("The strings in the sorted way are: ");
		for(int i = 0; i < s.length();i++){
            System.out.print(array[i]+ " ,");
        }

    }

	
	public static void bubbleSort(String[] s) {
		String temp;
		

        for (int p = 0; p < 10; p ++)
            {
                for (int q = p + 1; q <10; q ++) {
                    if(s[p].compareTo(s[q])>0)
                    {
                        temp = s[p];
                        s[p] = s[q];
                        s[q] = temp;
                    }
                }

            }

           
            

		
	}
}
