import java.util.Scanner;

public class LabProgram {

    public static int fibonacci(int n) {
        int fib = 0;
        if (n > 0) {
            int temp1 = 0;
            int temp2 = 1;
            for (int i = 1; i < n; i++) {
                fib = temp1 + temp2;
                temp1 = temp2;
                temp2 = fib;
            }
        } else if (n == 0) {
            fib = 0;
        } else {
            fib = -1;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }
}