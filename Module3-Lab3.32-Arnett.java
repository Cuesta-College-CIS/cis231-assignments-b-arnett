import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String emStr = scnr.nextLine();

        int atInd = emStr.indexOf('@');
        int dotInd = emStr.indexOf('.', atInd);
        char first = emStr.charAt(0);
        int firstChar = (int) first;
        int strLength = emStr.length();
        int numCheck;

        if ((firstChar > 64 && firstChar < 91) || (firstChar > 96 && firstChar < 123)) {
            numCheck = 1;
        } else {
            numCheck = -1;
        }
        ;

        if (strLength > 5 && strLength < 30 && atInd > 0 && dotInd > 0 && numCheck > 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
        ;

    }
}