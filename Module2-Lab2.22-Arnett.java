import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      
      System.out.println (Math.pow(x, z));
      System.out.println (Math.pow(x, Math.pow(y, z)));
      System.out.println (Math.abs(y));
      System.out.println (Math.sqrt(Math.pow(x*y, z)));
      
      
      
   };
};
