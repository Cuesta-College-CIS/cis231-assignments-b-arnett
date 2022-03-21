import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();
        int M = scnr.nextInt();

        int[][] numbers = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numbers[i][j] = scnr.nextInt();
            }
        }

        int flagGr = 0;
        int flagSm = 0;
        int rowsum = 0;
        int lastgr = 0;
        int lastsm = 0;

        for (int i = 0; i < N; i++) { // row sums
            rowsum = 0;
            for (int j = 0; j < M; j++) {
                rowsum += numbers[i][j];
            }
            if (i == 0) {
                lastsm = rowsum;
                lastgr = rowsum;
            } else {
                if (rowsum > lastgr) {
                    lastgr = rowsum;
                    flagGr = i;
                }

                if (rowsum < lastsm) {
                    lastsm = rowsum;
                    flagSm = i;
                }
            }
        }

        // collumn sums
        int colsum = 0;
        int flagcsm = 0;
        int flagcgr = 0;

        for (int i = 0; i < M; i++) {
            colsum = 0;
            for (int j = 0; j < N; j++) {
                colsum += numbers[j][i];
            }
            if (i == 0) {
                lastsm = colsum;
                lastgr = colsum;
            } else {
                if (colsum > lastgr) {
                    lastgr = colsum;
                    flagcgr = i;
                }
                if (colsum < lastsm) {
                    lastsm = colsum;
                    flagcsm = i;
                }
            }
        }

        for (int i = 0; i < M; i++) { // least row
            System.out.print(numbers[flagSm][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < M; i++) { // greatest row
            System.out.print(numbers[flagGr][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) { // least column
            System.out.print(numbers[i][flagcsm] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) { // least column
            System.out.print(numbers[i][flagcgr] + " ");
        }
        System.out.println();
    }

}