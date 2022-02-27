import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int userIn = scnr.nextInt();
        int n;

        for (n = userIn; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.print(0);
        scnr.close();

    }
}