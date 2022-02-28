import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int cnt = 0;
        char max_char;
        max_char = ' ';
        String userIn;
        int max = 0;

        userIn = scnr.nextLine();

        for (int i = 0; i < userIn.length(); ++i) {
            if (Character.isLetter(userIn.charAt(i))) {
                cnt += 1;
                if ((int) userIn.charAt(i) > (int) max_char) {
                    max_char = userIn.charAt(i);
                }
            }
        }

        System.out.printf("%d\t%c\n", cnt, Character.toUpperCase(max_char));
    }
}
