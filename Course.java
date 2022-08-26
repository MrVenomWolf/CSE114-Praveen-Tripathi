package Lab20;
import java.util.ArrayList;
public class Course {

    private String CourseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String CourseName) {
        this.CourseName = CourseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);

    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return CourseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        System.out.println("The student " + student + " has been dropped from the course " + CourseName);
    }

    public void clear() {
        students.clear();
        System.out.println("All the students have been cleared from the course.");
    }

       
}
