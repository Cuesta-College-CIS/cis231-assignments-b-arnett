
public class Student {
    private String name;
    private double gpa;

    public Student() {
        this.name = "Louie";
        this.gpa = 1.0;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public double getGPA() {
        return gpa;
    }

}