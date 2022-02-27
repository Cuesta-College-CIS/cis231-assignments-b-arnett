import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int count = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        int num = scnr.nextInt();
        boolean posInts = false;
        try {
            if (num < 0) {
                num = scnr.nextInt();
            } else {
                while (num >= 0) {
                    count++;
                    posInts = true;
                    sum += num;
                    max = Math.max(max, num);
                    min = Math.min(min, num);
                    num = scnr.nextInt();
                    if (num < 0) {
                        num = scnr.nextInt();
                    }

                }
            }
        } catch (Exception e) {
            int sumWo;
            double avg;

            if (posInts = false || count <= 2) {
                sumWo = 0;
                avg = 0.00;
            } else {
                count -= 2;
                min = (min < 0) ? 0 : min;
                max = (max < 0) ? 0 : max;
                sumWo = (sum - max - min);
                avg = ((double) sumWo / (double) count);
            }

            System.out.print(sumWo + " ");
            System.out.printf("%.2f\n", avg);

        }
    }
}
