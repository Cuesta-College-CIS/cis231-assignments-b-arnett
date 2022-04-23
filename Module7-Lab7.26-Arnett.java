public class Number {
    private Integer num;

    public Number(int n) {
        num = n;
    }

    public String toString() {
        String str = "The value is " + Integer.toString(num);
        return str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num = n;
    }

    public static void main(String[] args) {
        Number yourNum = new Number(723);
        System.out.print(yourNum);
    }
}