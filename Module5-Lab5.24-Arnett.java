import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int row = scnr.nextInt();
        int col = scnr.nextInt();

        int[][] numbers = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = scnr.nextInt();

            }

        }

        for (int i = 0; i < numbers.length; i++)
            System.out.println(Arrays.toString(numbers[i]));
        scnr.close();
    }

}
