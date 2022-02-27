import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        final int first = scnr.nextInt();
        int sum = first;
        int count = 0;
        while (sum <= 100) {
            int next = scnr.nextInt();
            sum += next;
            count++;
            if (sum > 100) {
                sum -= next;
                break;
            }
        }
        System.out.printf("%d\t%d\n", sum, count);

    }
}
