package Lab17package;

import java.util.ArrayList;
import java.util.Scanner;

public class lab17_1_1 {
    Scanner sc = new Scanner(System.in);

    public void test()
    {
       ArrayList <Character> myCharList = new ArrayList<Character>();
        System.out.println("Enter the input string: ");
        String str = sc.nextLine(); // a n u b r o t a 
        myCharList= toCharacterArray(str);

        // output

        for(int i=0; i<myCharList.size(); i++)
        {
            System.out.print(myCharList.get(i)+" ");
        }
       
    }



    public static ArrayList<Character> toCharacterArray(String str){ // a n u  b r a t a 

        ArrayList<Character> list = new ArrayList<Character>();
    
        for (int i = 0; i < str.length(); i++) {
        list.add(str.charAt(i));
        }
                return list; 
    }


    public static void main(String[] args) {
        lab17_1_1 l7= new lab17_1_1();
        l7.test();
        
    }    
    


    
}
