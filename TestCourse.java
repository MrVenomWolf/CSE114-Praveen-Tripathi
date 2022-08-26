public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + ", ");
	}
}
public class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		if(numberOfStudents == student.length()) {
		String[] temp = new String[numberOfStudents*2];
		
		for(int i = 0; i < numberOfStudents; i++)
			temp[i] = students[i];

		}
		numberOfStudents++;
	}
	public String[] getStudents() {
		String students1[] = new String[numberOfStudents];
		for(int i = 0; i < numberOfStudents; i++) {
			students1[i] = students[i];
		}
		return students1;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j = i; j < numberOfStudents - 1; j++) {
					students[j] = students[j + 1];
				}
				numberOfStudents--;
			}
		}
		System.out.println("The student " + student + " has been dropped from the course " + courseName);
	}
	public void clear() {

		numberOfStudents = 0;
		System.out.println("All the students have been cleared from the course.");

	}

}