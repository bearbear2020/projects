// ***********************************************
// Program Identification
// Name: Trent Giever
// Class:Java 1+2 
// Date: 10/2/15
// File Location: H:\My Documents\Java programs\Labch3
// ***********************************************

// ***********************************************
// Program Abstract
// The eighty point lab is sum and mean with integers
// The 100 point lab is to see the diference of integer and doubles.
// The purpose of this lab assignment is to demonstrate knowledge of using variables in a program and use arithmetic operators.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// sum- is the 80 point version sum of the four numbers
// mean- is the 80 point mean for dividing sum by the total number of numbers
// numOne- is the first number in 80 point version which is an integer
// numTwo- is the second number in 80 point version which is an integer
// numThree- is the third number in  80 point version which is a integer
// numFour- is the fouth number in 80 poiny version which is a integer
// means- is the 100 point version mean which divides the numbers by the nuber of numbers which is a double
// Sums- is the 100 point version sum that is all tht numbers added up
// numOnes- is the first number in the 100 point version which is a double
// numTwos- is the second numbr in the 100 point version which is a double
// numThrees- is the third number in the 100 point version which is a double
// numFour- is the fourth number in the 100 point version which is a double 
// ***********************************************

public class Labch3
{
   public static void main(String args[])
   {
    
    //Variables 
    
     // 80 point version
     int sum;
     int mean;
     int numOne = 11;
     int numTwo = 22;
     int numThree = 33;
     int numFour = 44;
    
     // 100 point version
     double means = 0;
     double sums = 0;
    double numOnes = 1.2345;
     double numTwos = 12.345;
     double numThrees = 123.45;
     double numFours = 1234.5;
    
    //Program
    
    //80 point version
     sum = (numOne + numTwo + numThree + numFour);
     mean = sum/4;
     
     sum = 0;
     //100 point version
     sums = (double)(numOnes + numTwos + numThrees + numFours);
     means = sums/4;
     
     //Output
    
     //80 point version
     System.out.println(numOne + "+" + numTwo + "+" + numThree + "+" + numFour + " = " +sum);
     System.out.println("Mean = " + sum + " / 4 = " + mean);
     
     System.out.println();
    
     // 100 point version
     System.out.println(numOnes + "+" + numTwos + "+" + numThrees + "+" + numFours + " = " +sums);
     System.out.println("Mean = " + sums + " / 4 = " + means);
   }
}

/*  run output
11+22+33+44 = 110
 Mean = 110 / 4 = 27
 
 1.2345+12.345+123.45+1234.5 = 1371.5295
 Mean = 1371.5295 / 4 = 342.882375
 */