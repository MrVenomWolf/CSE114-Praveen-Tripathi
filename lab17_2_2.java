package Lab17package;

import java.io.*;
import java.util.*; 

public class lab17_2_2 {

    public static ArrayList<String> mergeList(ArrayList<String> l1, ArrayList<String> l2)
    {
        for(int i=0; i<l2.size(); i++)
        {
            l1.add(l2.get(i));
        }
       
        System.out.println("My merged list is " + l1);
        Collections.sort(l1);
        System.out.println("My Sorted list is : " + l1);
        return null;

    }
    


    public static void main(String[] args) throws IOException {
        BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> tempList1 =new ArrayList<>();
        ArrayList<String> tempList2 =new ArrayList<>();
        char ch;
        String s;
        // input for list 1
        do{
                System.out.println("Enter a String : ");
                s=br.readLine();
                tempList1.add(s.toUpperCase());
                System.out.println("Want to add another? (y/n)");   
                ch= br.readLine().charAt(0);         
        }
        while(ch=='y' || ch=='Y');

        // input for list 1
        do{
            System.out.println("Enter a String : ");
            s=br.readLine();
            tempList2.add(s.toUpperCase());
            System.out.println("Want to add another? (y/n)");   
            ch= br.readLine().charAt(0);         
    }
    while(ch=='y' || ch=='Y');


    mergeList(tempList1, tempList2);
    }
}
