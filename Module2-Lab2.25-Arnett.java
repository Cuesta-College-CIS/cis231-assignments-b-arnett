import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int Qs;
        int Ds;
        int Ns;
        int Ps;
        double amount;

        Qs = scnr.nextInt();
        Ds = scnr.nextInt();
        Ns = scnr.nextInt();
        Ps = scnr.nextInt();

        amount = (((double) (Qs) * 0.25) + ((double) (Ds) * 0.1) + ((double) (Ns) * 0.05) + ((double) (Ps) * 0.01));

        System.out.printf("Amount: $%.2f\n", amount);

    }
}