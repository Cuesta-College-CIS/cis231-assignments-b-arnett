import java.util.Scanner;
import java.util.Random;

public class main {

    static class Ary {
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

        public void findGsum() {
            int idxStart = 0;
            int sum = 0;
            int sumFlag = 0;
            for (int i = 0; i < (ary.length - 2); i++) {
                sum = 0;
                sum += (ary[i] + ary[i + 1] + ary[i + 2]);
                if (sum > sumFlag)
                    idxStart = i;
                sumFlag = sum;
            }

            System.out.println(ary[idxStart] + " " + ary[idxStart + 1] + " " + ary[idxStart + 2]);
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n = scnr.nextInt();
        Ary median = new Ary();
        median.ArrayConst(n);

        for (int v : median.getAry()) {
            System.out.print(v + " ");
        }
        System.out.println();

        median.findGsum();

    }
}