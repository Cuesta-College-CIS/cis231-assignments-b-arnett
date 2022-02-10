import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random rand = new Random();

        int first = rand.nextInt(101);
        int second = rand.nextInt(101);
        int third = rand.nextInt(101);

        if (first > second) {
            if (second > third) {
                System.out.print(third + " " + second + " " + first); // 1 > 2 > 3

            } else if (first > third) {
                System.out.print(second + " " + third + " " + first); // 1 > 3 > 2

            } else {
                System.out.print(second + " " + first + " " + third); // 3 > 1 > 2

            }
            ;
        } else if (second > third) {
            if (first > third) {
                System.out.print(third + " " + first + " " + second); // 2 > 1 > 3

            } else {
                System.out.print(first + " " + third + " " + second); // 2 > 3 > 1

            }
            ;
        } else {
            System.out.print(first + " " + second + " " + third); // 3 > 2 > 1

        }
        ;

    }
} // 123 321 132 231 213 312