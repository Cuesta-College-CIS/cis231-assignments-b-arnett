import java.util.Random;

public class main {
    public static void main(Strings[] args) {

        Random rnd = new Random();

        int first = rnd.nextInt(101);
        int second = rnd.nextInt(101);
        int third = rnd.nextInt(101);

        int big;

        if ((first > second) && (first > third)) {
            big = 1;
        } else if ((second > first) && (second > third)) {
            big = 2;
        } else {
            big = 3;
        }
        ;

        System.out.println(first + " " + second + " " + third);

        if (big = 1) {
            System.out.println(first);
        } else if (big = 2) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
        ;

    }
}