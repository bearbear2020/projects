
package ch.pkg9.pkg8;
import static java.lang.System.*;
/*

   Programmer: Trent Giever
   Assignment Chapter: 9
   Purpose: Person, Customer, and PreferredCustomer Classes
   Date modified: 1/3/2021
   IDE/Tool used: NetBeans 8.2

   */
public class Ch98 {

    
    public static void main(String[] args)
    {
        PreferredCustomer one = new PreferredCustomer("test 1","123 street", "123 456 7890", 1, true, 11); //uses both overloaded constructors
        PreferredCustomer two = new PreferredCustomer("test 2","123 street", "123 456 7890", 2, true, 1501); //uses both overloaded constructors
        out.println(one);
        out.println(two);
    }
    
}
