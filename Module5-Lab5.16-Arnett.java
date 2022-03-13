import java.util.Scanner;
import java.util.Arrays;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // int aryLng = scnr.nextInt();
        // double[] userIn = new double[aryLng];
        // for (int i = 0; i < aryLng; i++) {
        // userIn[i] = scnr.nextDouble();
        // }
        // double maxIn = 0.0;
        // for (int j = 0; j < aryLng; j++) {
        // if (userIn[j] > maxIn) {
        // maxIn = userIn[j];
        // }
        // }
        double maxIn = 0.0;
        int aryLng = scnr.nextInt();
        double[] userIn = new double[aryLng];
        for (int i = 0; i < aryLng; i++) {
            userIn[i] = scnr.nextDouble();
            if ((i == 0) || (userIn[i] > maxIn)) {
                maxIn = userIn[i];
            }
        }
        double[] finalAry = new double[aryLng];
        for (int k = 0; k < aryLng; k++) {
            finalAry[k] = (userIn[k] / maxIn);
        }

        for (int l = 0; l < aryLng; l++) {
            System.out.printf("%.2f", finalAry[l]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
