import java.util.Scanner;
import java.util.ArrayList;

abstract class Person {
    String name;
    String DOB;

    public void Person(String a, String b) {
        name = a;
        DOB = b;
    }

    abstract void printPerson();

}

class Student extends Person {
    Integer sid;
    Integer credits;
    ArrayList<Course> clist;

    public void Student(String n, String dob, Integer x, Integer y) {

        name = n;
        DOB = dob;
        sid = x;
        credits = y;

        clist = new ArrayList<Course>();

    }

    public void printPerson() {
        System.out.println("Name: \t" + name + "\tDOB: \t" + DOB + "\nID: \t" + sid + "\tCredits: \t" + credits + "\n");
        for (int i = 0; i < clist.size(); i++) {
            (clist.get(i)).printCourseInfo();
        }
    }
}

interface CourseActivity {
    void decideGrade();

    void printCourseInfo();
}

class Course implements CourseActivity {
    String cid;
    String coursename;
    Integer score;
    String grade;

    public void Course(String id, String cname, Integer sc) {
        cid = id;
        coursename = cname;
        score = sc;
        decideGrade();
    }

    public void decideGrade() {

        if (score > 89)
            grade = "A";
        else if (score > 79)
            grade = "B";
        else if (score > 69)
            grade = "C";
        else if (score > 59)
            grade = "D";
        else
            grade = "F";
    }

    public void printCourseInfo() {
        System.out.println("CourseID \t" + cid + "\tName: " + coursename + "\t Score: " + Integer.toString(score)
                + "\t Grade: " + grade);
    }
}

public class main {
    public static ArrayList<Student> fillupStudent() {
        ArrayList<Student> slist = new ArrayList<Student>();
        Scanner scnr = new Scanner(System.in);

        while (scnr.hasNextLine()) {
            Integer tid = scnr.nextInt();
            String tname = scnr.next();
            Integer tc = scnr.nextInt();
            String dob = scnr.next();

            Student s = new Student();
            s.Student(tname, dob, tid, tc);
            int cn = (tc / 3);
            for (int i = 0; i < cn; i++) {
                String cid = scnr.next();
                String cnam = scnr.next();
                Integer credit = scnr.nextInt();
                Course c = new Course();
                c.Course(cid, cnam, credit);
                (s.clist).add(c);
            }
            slist.add(s);
        }

        return slist;
    }

    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++) {
            (slist.get(i)).printPerson();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);

    }
}