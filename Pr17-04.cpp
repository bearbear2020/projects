// This program illustrates the NumberList append,
// insert, and displayList member functions.
//Programmer: Trent Giever
//Purpose: Learn linked lists
//compiler VS 2017 community
#include <iostream>
using namespace std;
#include "SortedNumberList.h"

int main()
{
   SortedNumberList list;
   list.displayList();//test the error handling of empty array
   // Add elements in order
   cout << "Filling array with items in the main method" << endl;
   list.add(2.5);
   list.add(7.9);
   list.add(12.6);
   // Add a value that should go in the middle of the list
   list.add(10.5);
   // Display the list
   list.displayList();

   //ask user to eantr searched value
   double search;//used for user input  for search
   cout << "What number do you wan to find";//enter num
   cin >> search;//users search
   if (list.isMember(search) == true)//isMember funtion
	   cout << "This is in the list" << endl;//if in list
   else
	   cout << "Not in the list" << endl;//if not in list
   cout << endl;
   system("pause");
   return 0;
}