import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int N = scnr.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = scnr.nextInt();
        }

        int min = nums[0];
        int flag = 0;
        for (int i = 0; i < 5; i++) {
            min = nums[i];
            for (int j = (0 + i); j < N; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    flag = j;
                }
            }
            if (nums[i] != min) {
                nums[flag] = nums[i];
                nums[i] = min;
            }
            for (int v : nums) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

    }
}
