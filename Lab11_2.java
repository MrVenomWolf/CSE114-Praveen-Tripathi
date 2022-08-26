import java.util.Scanner;
public class Lab11_2 {

    public static void main(String[] args) {
        System.out.print("Enter the 10 numbers here: ");
        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
      for(int i = 0; i < 10;i++)
        {
          num[i] = in.nextInt();
        }

        reverse(num);


        for (int a: num) {
            System.out.print(a + " ");
        }

     

        in.close();

    }

    public static void reverse(int[] list) {
		int temp;
    int length= list.length;
		for (int i = 0; i < list.length / 2; i++) {
			temp = list[length - i - 1];
			list[length - i - 1] = list[i];
			list[i] = temp;
		}
	}
}

    

