package ch.pkg9.pkg7;
/*

   Programmer: Trent Giever
   Assignment Chapter: 9
   Purpose: Person and Customer Classes
   Date modified: 1/3/2021
   IDE/Tool used: NetBeans 8.2

   */
import static java.lang.System.*;

public class Ch97 {

   
    public static void main(String[] args) 
    {
        Customer one = new Customer(1,false); //obj with a default supper constructor, and overloaded Customer constructor
        Customer two = new Customer("test","123 street", "123 456 7890", 2, true); //uses both overloaded constructors
        out.println(one); //print what is in obj 1
        out.println(two);//print what is in obj 2
    }
    
}
