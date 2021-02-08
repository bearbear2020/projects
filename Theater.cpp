#include "Theater.h"
using namespace std;

Theater::Theater()
{
	
}

Theater::Theater(char *tnames, char *tlocations)//overloaded constructor
{
	strcpy_s(name, 80, tnames); //user defined name
	strcpy_s(location, 80, tlocations);//user defined location
}

char  * Theater::getName()//get the name of the theater
{
	return name; //returns name
}

void Theater::setName(char names[80])//sets the name of theater
{
	strcpy_s(name, 80, names);//sets name
	
}

char * Theater::getLocation()//gets the addess/location
{
	return location; //returns location

}

void Theater::setLocation(char locations[80])//sets the location.address
{
	strcpy_s(location, 80, locations);//sets location by users desire
	
}

void Theater::welcome()//desplays welcome
{
	cout << "Welcome to the ";
	cout << name;
	cout << " Theater at ";
	cout << location;
	cout << endl;
}