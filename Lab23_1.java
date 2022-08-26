package Lab23;

import java.util.Scanner;

public class Lab23_1 {

        public static void reverseDisplay(String value) {

            if (value.length() == 0) {
                return;
            }
            reverseDisplay(value.substring(1));
            char a = (value.charAt(0));
            System.out.print(a);
            
        }


        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string that you want to reverse: ");
        String s = in.nextLine();
        reverseDisplay(s);

       

        in.close();

    }

}

 

