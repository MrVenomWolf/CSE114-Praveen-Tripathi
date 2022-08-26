import java.util.Scanner;
public class Lab13_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students:- ");
        int numOfStudents = in.nextInt();
        System.out.print("Enter the marks of students:- ");
        
        int[] marks = new int[numOfStudents];
        int best = 0;

        for (int i =0; i < numOfStudents; i++) {
            marks[i] = in.nextInt();
            if (marks[i] > best) {
                best = marks[i];
            }
        }

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] >= best - 10)
            
            System.out.println("Student " + (i) + " score is " + marks[i] + " and grade is A");
                
            else if (marks[i] >= best - 20)
            
            System.out.println("Student " + (i) + " score is " + marks[i] + " and grade is B");
            
            else if (marks[i] >= best - 30)
            
            System.out.println("Student " + (i) + " score is " + marks[i] + " and grade is C");
            
            else if (marks[i] >= best - 40)
            
            System.out.println("Student " + (i) + " score is " + marks[i] + " and grade is D");

            else
                                  
            System.out.println("Student " + (i) + " score is " + marks[i] + " and grade is F");
            
        }

        in.close();
            
    }
    
}
