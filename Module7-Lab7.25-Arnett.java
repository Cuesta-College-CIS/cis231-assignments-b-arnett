import java.util.Scanner;

public class LabProgram {

    public static void swap(Number num1, Number num2) {
        int flag = num1.getNum();
        num1.setNum(num2.getNum());
        num2.setNum(flag);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int int1;
        int int2;

        int1 = scnr.nextInt();
        int2 = scnr.nextInt();

        Number num1 = new Number(int1);
        Number num2 = new Number(int2);

        swap(num1, num2);
        System.out.println("num1 = " + num1.getNum() + ", num2 = " + num2.getNum());
    }
}
