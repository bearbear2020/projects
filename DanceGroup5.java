import javax.swing.JOptionPane;
public class DanceGroup5

{
   public static void main(String[] args)
   {int numAttending;
      Dance prom = new Dance();
      numAttending = 125;
      //System.out.println("Number of chaperones: " + prom.chaperones(numAttending));
      System.out.println("Overall " + prom.OverallProfitOrLoss(940.00,81.75,90.53, 1814.00)) ; //(cost raffle & Decoration, Concession sales, miscellaneous costs)
   }
}
class Dance
{
   private int numSingles;
   private int numCouples;
   private double costPerSingle;
   private double costPerCouple;
   private double gateSales;
   private String musicType;
   private String facility;

   public Dance()
   {
   
   }
//determains the profit or loss of the dance
 // output if concessions is greater than 0 or a profit the program will add concessions, if it is less than zero the program subtracts concessions
   public static double OverallProfitOrLoss(double gateSales, double costRaffleDecoration,double ConcessionProfitOrLoss,double miscCost)   
   {
      return ((gateSales +ConcessionProfitOrLoss)- (costRaffleDecoration +  miscCost));
   } 
   
   public int chaperones (int numAttendance)  // Sample Method
   {
      int numChaperones;
      numChaperones = numAttendance / 35;
      return numChaperones;
   }
}
