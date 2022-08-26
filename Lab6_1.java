import java.lang.Math;
public class Lab6_1 {
    
    public static void main(String [] args) {
        
        double b = 0;
        for (int i = 0; i < 10; i++) {
            int a = Math.abs((int) (Math.random() * (90 + 1)) + 10);
            b +=a;
        }
        System.out.println(b/10);

               



    }
    
}
