import java.util.Scanner;
import java.util.Random;

public class main {

    static class AryC {
        int[] ary;

        public void ArrayConst(int x) {
            Random rgen = new Random();
            ary = new int[x];
            for (int i = 0; i < x; i++) {
                ary[i] = rgen.nextInt(100);
            }
        }

        public int[] getAry() {
            return ary;
        }

        public int findMed() {
            int index = 0;
            int higher;
            int mid = (ary.length - (ary.length / 2) - 1);
            for (int i = 0; i < ary.length; i++) {
                higher = 0;
                for (int n = 1; n < ary.length; n++) {
                    if (ary[i] < ary[n])
                        higher++;
                }
                if (higher == mid) {
                    index = i;
                    break;
                }
            }
            return index;
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n = scnr.nextInt();
        AryC median = new AryC();
        median.ArrayConst(n);

        for (int v : median.getAry()) {
            System.out.print(v + " ");
        }
        System.out.println();

        int ind = median.findMed();
        System.out.println((median.getAry())[ind]);

    }
}