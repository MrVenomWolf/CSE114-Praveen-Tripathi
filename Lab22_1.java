
import java.io.*;
import java.util.ArrayList;
public class Lab22_1 {
    public static void main(String[] args) throws Exception{

        ArrayList<String> l = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("cities.txt"));
        String s = br.readLine();
        
        while(s != null){
            l.add(s);
            s = br.readLine();
        }

        PrintWriter w = new PrintWriter(new FileWriter("output.txt"));
        
        for(int i = 0; i < l.size(); i++){
            w.println(l.get(i));
        }
        w.close();



        
        
    }
}