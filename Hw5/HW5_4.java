package HW5;

import java.util.Scanner;

    public class HW5_4 
    {
        Scanner sc= new Scanner(System.in);
        double [][] arr = new double[3][3];
        int i,j;
        
        public void input()
        {
            System.out.println("Enter a 3-by-3 matrix row by row: ");
            
            for(i=0; i<3; i++)
            {
                for(j=0; j<3; j++)
                {
                    
                    arr[i][j]= sc.nextDouble();
                }
            }
            
        }
        
        public void sorting()
        {
            double temp;
            for(i=0; i<3; i++) // row
            {
                for(j=0; j<3; j++) // col
                {
                    for(int k=j+1; k<3; k++)
                    {
                        if(arr[i][j] > arr[i][k])
                        {
                            temp=arr[i][j];
                            arr[i][j]=arr[i][k];
                            arr[i][k]= temp;
                            
                        }
                    }
                }
                
            }	
        }
        public void output()
        {
            System.out.println("My row sorted array is :");
            for(i=0; i<3; i++)
            {
                for(j=0; j<3; j++)
                {
                    System.out.print(arr[i][j]+ " ");
                    
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args)
        {
            HW5_4 sm= new HW5_4();
            sm.input();
            sm.sorting();
            sm.output();
        }
    
    }



