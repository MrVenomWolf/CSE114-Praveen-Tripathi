import java.util.Scanner;
public class Lab6_2 {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name of the first city:-");
        String city1 = in.nextLine().toUpperCase();
        System.out.print("Enter the name of the second city:-");    
        String city2 = in.nextLine().toUpperCase();
        System.out.print("Enter the name of the third city:-");
        String city3 = in.nextLine().toUpperCase();

        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0){
            System.out.print(city1 + " ");
            
            if (city2.compareTo(city3) < 0){
                
                System.out.print(city2 + " ");
                System.out.println(city3);
            } else {
                System.out.print(city3 + " ");
                System.out.println(city2);
            }
            
        } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0){
            System.out.print(city2 + " ");
            
            if (city1.compareTo(city3) < 0) {
                System.out.print(city1 + " ");
                System.out.println(city3);
            
            } else {
  
                System.out.print(city3 + " ");
                System.out.println(city1);
            }
        } else {
            System.out.print(city3 + " ");
            
            if(city1.compareTo(city2) < 0){
                System.out.print(city1 + " ");
                System.out.println(city2);
            
            } else {
                System.out.print(city2 + " ");
                System.out.println(city1);
            }
        }

        in.close();
    }
}