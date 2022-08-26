
import java.util.ArrayList;
public class Lab19_2 {

    public static void main(String[] args) {
        ArrayList<Integer>grades = new ArrayList<Integer>();
        grades.add(12);
        grades.add(69);
        grades.add(77);
        grades.add(88);
        grades.add(99);
        grades.add(44);
        grades.add(67);
        grades.add(80);
        grades.add(62);
        grades.add(73);
        grades.add(91);

        System.out.println(sortedGrades(grades));


    }

    public static ArrayList<Character> sortedGrades(ArrayList<Integer> grades) {
        ArrayList<Character> grades2 = new ArrayList<Character>();
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) >= 90) {
                grades2.add('A');
            } else if(grades.get(i) >= 80 && grades.get(i) <= 89) {
                grades2.add('B');
            } else if(grades.get(i) >= 70 && grades.get(i) <= 79) {
                grades2.add('C');
            } else if(grades.get(i) >= 60 && grades.get(i) <= 69) {
                grades2.add('D');
            } else {
                grades2.add('F');
            }
        }
        return grades2;
    }
    
}
