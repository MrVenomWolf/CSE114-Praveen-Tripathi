import java.util.Scanner;
public class Lab8_2{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String date;
  String m;
  
  int day,month,year;

  String[] months = {"","January","February","March", "April", "May", "June", "July", "August","September", "October", "November", "December" };
  
  System.out.print("Input Date mm/dd/yyyy:- ");
  
  date = in.nextLine();
  month = Integer.parseInt(date.substring(0, 2));
  
  m = months[month];
  day = Integer.parseInt(date.substring(3, 5));
  year = Integer.parseInt(date.substring(6, 10));

  System.out.println( m + " " + day + ", " + year );

  in.close();
  }

}