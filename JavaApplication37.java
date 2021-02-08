package javaapplication37;
import static java.lang.System.out;
/*

   Programmer: Trent Giever
   Assignment Chapter: 14
   Purpose: Recursion
   Date modified: 1/16/21
   IDE/Tool used: NetBeans 8.2

   */

public class JavaApplication37 {

    public static void main(String[] args) {
       String myarray = "A test for this program"; //create a string array
       char [] array = myarray.toCharArray(); //convert to char array
       int n = array.length; //gets the length, or n value
       out.println("Spaces in the array: " + characters(array,n,' ')); //calls the recursion method for a space
       out.println("t's in the array: " + characters(array,n,'t'));//calls the recursion method of a t
    }
    
    public static int characters(char array[], int n, char target) //recursion method
    {
        if(n == 0) //stop value
            return 0;//rend of return
        
        if(array[n -1] == target) //if the characters match
            return characters(array,n-1,target) + 1; //add one, and keep calling the characters method
      
        return characters(array,n-1,target); //call the characters method with one less on n value
    }
    
}
