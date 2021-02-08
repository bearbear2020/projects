/*

   Programmer: Trent Giever
   Assignment Chapter: 9
   Purpose: Ships
   Date modified: 1/4/2021
   IDE/Tool used: NetBeans 8.2

   */
import static java.lang.System.*;
public class ch910 {

    
    public static void main(String[] args) 
    {
        Ship[] fleet = new Ship[3];
        fleet[0] = new Ship("Baby", "2020");
        fleet[1] = new CruiseShip("Fun", "2010", 2000);
        fleet[2] = new CargoShip("Heavy", "1990", 500000);
        
        for(int i=0;i < 3; i++)
        {
            out.println(fleet[i]);
        }
    }
    
}
