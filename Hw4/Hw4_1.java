import java.util.Scanner;
public class Hw4_1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 10 integers: ");
        int[] l1 = new int[10];

        for (int i = 0; i < l1.length; i ++ )
         {
            l1[i] = in.nextInt();
         }

        int[] distinct = eliminateDuplicates(l1);

        System.out.print("The distinct integers are: ");
        for (int p: distinct) {
            System.out.print(" " + p);

        }

       
        }


    

    public static int[] eliminateDuplicates(int[] l) {
        int[] distinct = new int[l.length];
        int distinctIndex = 0;
        for (int i = 0; i < l.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < distinctIndex; j++) {
                if (l[i] == distinct[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                distinct[distinctIndex] = l[i];
                distinctIndex++;
            }
        }
        int[] distinct2 = new int[distinctIndex];
        for (int i = 0; i < distinctIndex; i++) {
            distinct2[i] = distinct[i];
        }
        return distinct2;
    }
}

