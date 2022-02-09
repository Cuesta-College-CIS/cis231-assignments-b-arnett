import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        char x;
        x = scnr.next().charAt(0);

        switch (x) {

            case 'A':
            case 'a':
                System.out.print("The score range is 90 ~ 100");
                break;

            case 'B':
            case 'b':
                System.out.print("The score range is 80 ~ 89");
                break;

            case 'C':
            case 'c':
                System.out.print("The score range is 70 ~ 79");
                break;

            case 'D':
            case 'd':
                System.out.print("The score range is 60 ~ 69");
                break;

            case 'F':
            case 'f':
                System.out.print("The score range is 0 ~ 59");
                break;
            default:
                System.out.print("How did you get that score?");
                break;
        }

    }
}