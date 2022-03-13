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

        // for (int k = 0; k < finalAryLng; k++) {
        // for (int l = k; l < aryLng; l++) {
        // if (userValues[l] <= maxVal) {
        // finalAry[k] = userValues[l];
        // break;
        // }
        // }

        // No need to use nested for loop.
        // Based on your code, I can suggest the following code.
        // Check out the following code

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  
        // Option 1
        int k = 0;
        for (int l = 0; l < aryLng; l++) {
            if (userValues[l] <= maxVal) {
                finalAry[k] = userValues[l];
                k += 1; // K will not be greater than "finalAryLng".
                // break;
            }
        }

        // Option 2
        // No need to use an extra array. 
        // Without an extra array, "finalAry",
        for (int f = 0; f < aryLng; f++) {
            if (userValues[f] <= maxVal)
                System.out.print(userValues[f] + ",");
        }
        // for (int f = 0; f < finalAryLng; f++) {
        //     System.out.print(finalAry[f] + ",");
        }
        System.out.println();

    }
