import java.util.Scanner;
public class Lab7_1 {

    public static void main(String [] args) {
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the phone number:- ");
        String phone = in.nextLine();

        System.out.println("Formatted phone number:- (" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6));

        in.close();

    }
    
    
}
