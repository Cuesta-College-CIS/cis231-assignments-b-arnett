import java.util.Scanner;
import java.util.Arrays;

public class LabProgram {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int N = scnr.nextInt();
        int M = scnr.nextInt();
        int[][] numbers = new int[N][M];
        int cnt = 0;

        try {
            for (int i = 0; i < numbers.length; i++)
                for (int j = 0; j < numbers[i].length; j++)
                    numbers[i][j] = scnr.nextInt();
        } catch (Exception e) {
            System.err.println("Input Error");
            e.printStackTrace();
        }

        for (int i = 1; i < (N - 1); i++) { // N is rows
            for (int j = 1; j < (M - 1); j++) {
                if (numbers[i][j] == 1) {
                    if ((numbers[i - 1][j] == 1) && (numbers[i + 1][j] == 1) && (numbers[i][j - 1] == 1)
                            && (numbers[i][j + 1] == 1)) {
                        cnt++;

                    }
                }
            }
        }

        System.out.println(cnt);
        scnr.close();
    }

}