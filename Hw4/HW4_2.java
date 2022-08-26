import java.util.Scanner;
public class HW4_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size1, size2;
        System.out.println("Enter the first list size and contents: ");
        int[] l1 = new int[in.nextInt()];
      
        for (int i = 0; i < l1.length; i ++ ) {
            l1[i] = in.nextInt();

        }

        System.out.print("The contents of the first list is: ");
        for (int i = 0; i < l1.length; i ++ ) {
           System.out.print( l1[i]+" ");

        }
        System.out.println(" ");

        System.out.print("Enter the second list size and contents: ");
		int[] l2 = new int[in.nextInt()];
		for (int i = 0; i < l2.length; i++) {
			l2[i] = in.nextInt();
            
		}

        System.out.print("The contents of the second list is: ");
        for (int i = 0; i < l2.length; i ++ ) {
           System.out.print( l2[i]+" ");

        }
        System.out.println(" ");

		
		int[] mergelist = merge(l1, l2);

		
		System.out.print("The merged list is");
		for (int p: mergelist) {
			System.out.print(" " + p);
		}
		
        System.out.println();
	}

	public static int[] merge(int[] l1, int[] l2)  {
		int[] mergelist = new int[l1.length + l2.length];
	
		for (int i = 0; i < l1.length; i++)
			mergelist[i] = l1[i]; // putting l1

  
		 for (int i = 0, j = l1.length; i < l2.length; i++, j++) {
			mergelist[j] = l2[i];
		}

		sort(mergelist);

		return mergelist;
    	}

	
	public static void sort(int[] l) {
		for (int i = 0; i < l.length - 1; i++) {
			int min = l[i];
			int minIndex = i;

			for (int j = i + 1; j < l.length; j++) {
				if (l[j] < min) {
					min = l[j];
					minIndex = j; 
				}					
			}

			if (minIndex != i) {
				l[minIndex] = l[i];
				l[i] = min;
			}
		}
	}
}


    