import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n; // n : user input
        Scanner scnr = new Scanner(System.in);

        n = scnr.nextInt();
        int out = 0;
        while (out < n) {
            System.out.print(out + " ");
            out += 1;
        } 
        

    }
}