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
        // When the input value is 99,
        // line 16 break never occured.
        // "idx" will be 4, not 5
        // because idx = k was executed last when the k is 4.
        // When k is 5 at the line 13, the loop will stop.
        // At this time, line 14 idx = k will not be executed.

        for (int i = length - 1; i >= idx; i--) { // Thus i = 4, i >= idx is true
            numbers[i + 1] = numbers[i]; // numbers[5] = numbers[4], Thus, 5 20 30 35 50 50
        }
        numbers[idx] = insert_value; // and then numbers[4] = 99, thus 5 20 30 35 99 50

        for (int j = 0; j <= length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        scnr.close();
    }

}
