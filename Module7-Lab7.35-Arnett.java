import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster; // collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public void dropStudent(String last) {
        for (int i = 0; i < roster.size(); i++) {
            if ((roster.get(i)).getLast() == last)
                roster.remove(i);
        }
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public int countStudents() {
        return roster.size();
    }
}