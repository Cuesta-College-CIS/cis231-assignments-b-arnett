import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

nteger sid;String sname;ArrayList<Course>clist;

t id,String name,ArrayList<Course>c){

me;clist=c;

}

public I nteger getTotalCredits(){ // reurn s total credits of the courses
Integer cred=0;for(int i=0;i<clist.size();i++)cred+=((clist.get(i)).getCredit());

return cred;}

public String toString(){ // override the toString to pring the object instance,
                                                                                                                        // return the string to print all info of the student object
String str="Student: "+Integer.toString(sid)+" "+sname+"\n\t";for(int o=0;o<clist.size();o++){str+=(clist.get(o).toString()+"\n\t");}str+="\n"+"Tota l Credits "+Integer.toString(getTotalCredits())+"\n";return str;

}

}

//////////////////////////////
class Course {
    String cid;
    String cname;

    ng grade;

    public Course(String id, Stri

        cname = name;

    public Integer getCredit() {
        return credit;
    }

    public String toString() {
        String str = "Course: " + cid + " " + cname + " " + Integer.toString(credit) + " " + grade;
        return str;
    }

}

///////////////////////
public class Quiz4 { // CHANGE TO QUIZ4

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