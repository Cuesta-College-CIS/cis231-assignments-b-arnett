import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster; // collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public ArrayList<Student> getDeansList() {
        ArrayList<Student> deansList = new ArrayList<Student>();
        for (int i = 0; i < roster.size(); i++) {
            if ((roster.get(i)).getGPA() >= 3.5) {
                deansList.add(roster.get(i));
            }
        }
        return deansList;
    }

    public void addStudent(Student s) {
        roster.add(s);

    }
}