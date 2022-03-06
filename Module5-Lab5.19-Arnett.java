import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        int length = 5;
        int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
        int insert_value;
        int idx = 0;

        Scanner scnr = new Scanner(System.in);
        insert_value = scnr.nextInt();

        for (int k = 0; k < length; k++) {
            idx = k;
            if (insert_value < numbers[k]) {
                break;
            }
        }

        for (int i = length - 1; i >= idx; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[idx] = insert_value;

        for (int j = 0; j <= length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        scnr.close();
    }

}
