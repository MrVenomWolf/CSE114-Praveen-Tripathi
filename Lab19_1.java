
import java.util.Scanner;
import java.util.ArrayList;
public class Lab19_1 {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }


        sort(list);

        System.out.println("The numbers in increasing order are: ");
        System.out.println(list);

        in.close();


    }

    public static void sort(ArrayList<Integer> list) {
        
        for(int i = 0; i < list.size(); i++) {
            
            for(int j = i + 1; j < list.size(); j++) {
                
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

    }
    
    
}
