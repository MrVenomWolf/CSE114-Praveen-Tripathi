public class Lab9_2 {
    public static void main(String args[]) {
        
        System.out.println("i m(i)");
        
        for(int i = 1; i < 21 ; i++) {
            
            System.out.println(i + " " + series_sum(i));
        }
    }
    
    public static String series_sum(int i){
        double sum = 0;
        
        for(double j = 1; j <= i; j++) {
            
            sum += j / ( j + 1 );
        }
        
        return String.format("%.4f",sum);
    }
}
