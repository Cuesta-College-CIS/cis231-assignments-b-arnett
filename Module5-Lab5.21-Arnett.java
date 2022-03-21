import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int N1 = scnr.nextInt();
        if (N1 == 0) {
            N1 = scnr.nextInt();
        }
        int[] num1 = new int[N1];
        for (int i = 0; i < N1; i++)
            num1[i] = scnr.nextInt();
        try {
            int N2 = scnr.nextInt();
            int[] num2 = new int[N2];
            for (int i = 0; i < N2; i++)
                num2[i] = scnr.nextInt();

            int[] num3 = new int[N1 + N2];
            for (int j = 0; j < num3.length; j++) {
                if (num1[0] < num2[0]) {
                    if (j < N1) {
                        num3[j] = num1[j];
                    } else {
                        num3[j] = num2[j - N1];
                    }
                } else {
                    if (j < N2) {
                        num3[j] = num2[j];
                    } else {
                        num3[j] = num1[j - N2];
                    }
                }

            }

            for (int j = 0; j < num3.length; j++)
                System.out.print(num3[j] + " ");
            System.out.println();
            scnr.close();
        } catch (Exception e) {
            for (int k = 0; k < N1; k++) {
                System.out.print(num1[k] + " ");
            }
            System.out.println();
            scnr.close();
        }
    }
}
