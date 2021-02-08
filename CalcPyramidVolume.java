import java.util.Scanner;

public class CalcPyramidVolume {

   public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight){
      double base = baseLength * baseWidth;
      return (((base)*pyramidHeight)*1/3);
      
   }

   public static void main (String [] args) {
      System.out.println("Volume for 1.0, 1.0, 1.0 is: " + pyramidVolume(1.0, 1.0, 1.0));
      return;
   }
}