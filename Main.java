package pkg14.pkg8;

import static java.lang.System.out;

/*

   Programmer: Trent Giever
   Assignment Chapter: 14
   Purpose: Recursion
   Date modified: 1/16/21
   IDE/Tool used: NetBeans 8.2

   */

public class Main 
{

    
    public static void main(String[] args) 
    {
        out.println(sum(50));
    }
    
    public static int sum(int num)
    {
        if(num == 1) //stop value
            return 1; //end of returns
        return sum(num -1) + num;
    }
    
}
