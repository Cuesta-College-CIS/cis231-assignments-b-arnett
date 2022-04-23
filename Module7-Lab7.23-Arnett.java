import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        // TODO: Read and set base and height for triangle1 (use setBase() and
        // setHeight())
        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());
        // TODO: Read and set base and height for triangle2 (use setBase() and
        // setHeight())
        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());
        // TODO: Determine larger triangle (use getArea())
        int flag = 0;
        if (triangle1.getArea() > triangle2.getArea())
            flag = 1;
        else
            flag = 2;

        System.out.println("Triangle with larger area:");
        // TODO: Output larger triangle's info (use printInfo())
        if (flag == 1)
            triangle1.printInfo();
        else if (flag == 2)
            triangle2.printInfo();
    }
}
