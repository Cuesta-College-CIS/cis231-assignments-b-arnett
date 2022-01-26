import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        int product1;
        int avg1;

        product1 = (num1 * num2 * num3 * num4);
        avg1 = (num1 + num2 + num3 + num4) / 4;

        double product2;
        double avg2;

        product2 = (num1 * num2 * num3 * num4);
        avg2 = (num1 + num2 + num3 + num4) / 4.0;

        System.out.println(product1 + " " + avg1);

        System.out.printf("%.3f", product2);
        System.out.print(" ");
        System.out.printf("%.3f", avg2);
        System.out.println();

    }
}
