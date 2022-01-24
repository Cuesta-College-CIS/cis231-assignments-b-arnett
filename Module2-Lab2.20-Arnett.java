import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        int originalNumber;
        int divisionFactor;

        Scanner scnr = new Scanner(System.in); // no period between new and scanner

        originalNumber = scnr.nextInt();
        divisionFactor = scnr.nextInt();

        var firstDiv = (originalNumber / divisionFactor);
        var secondDiv = (firstDiv / divisionFactor);
        var thirdDiv = (secondDiv / divisionFactor);

        System.out.println(firstDiv + " " + secondDiv + " " + thirdDiv);
    };
};
