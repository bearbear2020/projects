#pragma once
//#pragma warning(disable : 4996)
#ifndef THEATER_H
#define THEATER_H
//creates a header file
#include <iostream> //needed for testing purposes with outputting if needed
#include <string> //using strings then convert into c-string when time to output to file
#include <iomanip>
using namespace std;
class Theater //Theater class, base class for TicketManager 
{
private:
    char  name[80]; //name of the Theater
	char  location[80];//address
public:
	Theater();//default constructor
	
	Theater(char *tnames, char *tlocations);//overloaded constructor
	
	char  * getName();//get the name of the theater
	
	void setName(char names[80]);//sets the name of theater
	
	char * getLocation();//gets the addess/location
	
	void setLocation(char locations[80]);//sets the location.address
	
	void welcome(); //desplays welcome

};

//end of class
#endif
