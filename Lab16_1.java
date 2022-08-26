import java.lang.reflect.Array;

public class Lab16_1 {

    public static void main(String[] args) {
        
        int[][] m = {
            {4,2},
            {1,7},
            {4,5},
            {1,2},
            {1,1},
            {4,1}};  // 2 col, 6 row

        //sort(m);
        // printing mt 2d array
        System.out.println("My array is : "+ m[0][1].length);

        System.out.println("My array after sorting : ");
        for (int i = 0; i <m.length; i++) {
            System.out.print("{");
            for (int j = 0; j <m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("}");
        }


        
    }
    
public static void sort(int[][] m) 
{
    int i, j, temp;
    int x=m.length;
    int y=m[0].length; // number of columns
    for (i = 0; i < x*y - 1; i++)  // number of loop is (row x col) //5x6= 30
    {
        for (j = 0; j < x*y - 1 - i; j++) 
        {
            if (m[j / m[0].length][j % y] > m[(j + 1) / y][(j + 1) % y]) 
            {
                temp = m[(j + 1) / y][(j + 1) % y];
                m[(j + 1) / y][(j + 1) % m[0].length] = m[j / y][j % y];
                m[j / y][j % y] = temp;
            }
        }

    }
} 

}   
    

