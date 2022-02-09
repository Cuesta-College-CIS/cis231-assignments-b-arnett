import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int x;
        int y;

        x = scnr.nextInt();
        y = scnr.nextInt();

        if (x > 0 && y > 0 && x < 100 && y < 100) {
            System.out.print("1");
        } else if (x < 0 && y > 0 && x > -100 && y < 100) {
            System.out.print("2");
        } else if (x < 0 && y < 0 && x > -100 && y > -100) {
            System.out.print("3");
        } else if (x > 0 && y < 0 && x < 100 && y > -100) {
            System.out.print("4");
        } else {
            System.out.print("0");
        }
        ;

    }
}