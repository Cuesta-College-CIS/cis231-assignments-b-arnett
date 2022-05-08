import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Student {
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    public Student(int id, String name, ArrayList<Course> c) {
        sid = id;
        sname = name;
        clist = c;

    }

    public Integer getTotalCredits() { // returns total credits of the courses
        Integer cred = 0;
        for (int i = 0; i < clist.size(); i++)
            cred += ((clist.get(i)).getCredit());

        return cred;
    }

    public String toString() { // override the toString to pring the object instance,
                               // return the string to print all info of the student object
        String str = "Student: " + Integer.toString(sid) + " " + sname + "\n\t";
        for (int o = 0; o < clist.size(); o++) {
            str += (clist.get(o).toString() + "\n\t");
        }
        str += "\n" + "Total Credits " + Integer.toString(getTotalCredits()) + "\n";
        return str;

    }

    public Integer getId() {
        return sid;
    }
}

//////////////////////////////
class Course {
    String cid;
    String cname;
    Integer credit;
    String grade;

    public Course(String id, String name, Integer c, String g) {
        cid = id;
        cname = name;
        credit = c;
        grade = g;
    }

    public Integer getCredit() {
        return credit;
    }

    public String toString() {
        String str = "Course: " + cid + " " + cname + " " + Integer.toString(credit) + " " + grade;
        return str;
    }

}

///////////////////////
public class Main { // CHANGE TO QUIZ4

    public static ArrayList<Student> fillupStudent() {
        ArrayList<Student> slist = new ArrayList<Student>();
        Scanner scnr = new Scanner(System.in);

        while (scnr.hasNextLine()) {
            Integer tid = scnr.nextInt();
            String tname = scnr.next();
            int tc = scnr.nextInt();
            ArrayList<Course> clist = new ArrayList<Course>();
            for (int i = 0; i < tc; i++) {
                String cid = scnr.next();
                String cname = scnr.next();
                Integer credit = scnr.nextInt();
                String grade = scnr.next();
                Course c = new Course(cid, cname, credit, grade);
                clist.add(c);
            }
            Student ss = new Student(tid, tname, clist);
            slist.add(ss);
        }
        return slist;
    }

    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++) {
            System.out.println((slist.get(i)).toString());
        }
    }

    public static void printStudent(ArrayList<Student> slist, Integer id) {
        System.out.println("The student who has the greatest credits: \n" + (slist.get(id).toString()));
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        Integer flag = 0;
        int ind = 0;
        Integer temp = 0;
        for (int i = 0; i < slist.size(); i++) {
            temp = (slist.get(i)).getTotalCredits();
            if (temp > flag) {
                ind = i;
                flag = temp;
            }
        }
        Integer id = ind;
        return id;
    }

    public static void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist;
        slist = fillupStudent();
        printStudent(slist);
        sid = findStudent(slist);

        printStudent(slist, sid);

    }
}