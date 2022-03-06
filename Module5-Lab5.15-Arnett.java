import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int aryLng = scnr.nextInt();
        int maxVal;
        int[] userValues = new int[aryLng]; // List of integers from input

        for (int i = 0; i < aryLng; i++) {
            userValues[i] = scnr.nextInt();
        }
        maxVal = scnr.nextInt();
        int finalAryLng = aryLng;
        for (int j = 0; j < aryLng; j++) {
            if (userValues[j] > maxVal) {
                finalAryLng -= 1;
            }
        }

        int[] finalAry = new int[finalAryLng];

        for (int k = 0; k < finalAryLng; k++) {
            for (int l = k; l < aryLng; l++) {
                if (userValues[l] <= maxVal) {
                    finalAry[k] = userValues[l];
                    break;
                }
            }

        }

        for (int f = 0; f < finalAryLng; f++) {
            System.out.print(finalAry[f] + ",");
        }
        System.out.println();

        
    }
}
