import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int[] constructArray(int next) {
        Random randGen = new Random();
        int[] ary = new int[next];
        for (int i = 0; i < next; i++) {
            ary[i] = randGen.nextInt(100);
        }
        ;
        return ary;
    }

    public static int printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return 0;
    }

    public static int findMoreEvens(int[] one, int[] two) {
        int oneEv = 0;
        int twoEv = 0;
        int flag = 0;
        for (int i = 0; i < one.length; i++) {
            if ((one[i] % 2) == 0) {
                oneEv += 1;
            }
        }
        for (int j = 0; j < two.length; j++) {
            if ((two[j] % 2) == 0) {
                twoEv += 1;
            }
        }
        if (oneEv > twoEv)
            flag = 1;
        else
            flag = 2;

        return flag;
    }

    public static int findGreatest(int[] one, int[] two) {
        int oneM = 0;
        int flago = 0;
        int twoM = 0;
        int flagt = 0;
        int rtnVal = 0;
        for (int i = 0; i < one.length; i++) {
            if (one[i] > oneM) {
                oneM = one[i];
                flago = i;
            }
        }
        one[flago] = one[one.length - 1];
        one[one.length - 1] = oneM;
        for (int j = 0; j < two.length; j++) {
            if (two[j] > twoM) {
                twoM = two[j];
                flagt = j;
            }
        }
        two[flagt] = two[two.length - 1];
        two[two.length - 1] = twoM;
        if (oneM > twoM)
            rtnVal = 1;
        else
            rtnVal = 2;

        return rtnVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] array1, array2;

        array1 = constructArray(scnr.nextInt());
        array2 = constructArray(scnr.nextInt());

        printArray(array1);
        printArray(array2);

        int result = findMoreEvens(array1, array2);
        System.out.println("The array " + result + " has more even numbers");

        result = findGreatest(array1, array2);
        if (result == 1)
            System.out.println(
                    "The array " + result + " has the greatest value " + array1[array1.length - 1]);
        else
            System.out.println(
                    "The array " + result + " has the greatest value " + array2[array2.length - 1]);

        scnr.close();
    }
}