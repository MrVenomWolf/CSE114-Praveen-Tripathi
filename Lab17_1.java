import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lab17_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str = in.nextLine();

        ArrayList<Character> list = new ArrayList<Character>();

        System.out.println("Elements of the Character array list: " );

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        public static ArrayList<Character> toCharacterArray(String str){

            
            
            ArrayList<Character> list = new ArrayList<Character>();
        
            
            for (int i = 0; i < str.length(); i++) {
            
            list.add(str.charAt(i));
            
            }
            
            return list;  
            
        }
    }    
    
    
}
