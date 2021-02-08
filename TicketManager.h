#pragma once
#ifndef TICKETMANAGER_H
#define TICKETMANAGER_H
//starts the header file
#include "Theater.h" //import Theater class
#include "TicketCost.h" //import TicketCost class
#include <iostream> //needed for output
#include <string>//needed to handle any string needs in future
#include <cstring>//needed for the cstrings
#include <fstream> //needed for the file

using namespace std;
class TicketManager : public Theater //Theater can have mulitiple Theaters/Auditoriums/etc
{
private:
	fstream SeatsSold;//used for the fstream
	char seatArray[15][30]; //array for the seats being available
	TicketCost seatCost[15][30];//TicketCost composition array for each seat
	static char  fileName[15];//fileName
	bool showStarted=false;//used for refunds if show started, then no refunds
	class OutOfRange {};//used to throw errors at
public:
	TicketManager();//default and prefered constructor
	
	TicketManager(char *name, char *location);// : Theater(name, location);//overloaded constructor
	
	void startUp();//constuctors shared startup method
	
	char getSeat(int r, int c);//returns the  seat availability
	
	bool buySeat(int r, int c);//15x30

	void writeToFile(); //write the data to the file
	
	void getSeatMap(); //draws seat map

	void setSeatCost(int r, int c, double cost);//sets the cost of the seat

	void setSeatCost(int r, double cost); //sets the cost for the row
	
	double getSeatCost(int r, int c);//returns the cost for a seat
	
	void showStartedShow();//used to deny refunds once show has started

	void refundTicket(int r, int c);//determines a refund based on show started and not an empty seat
	
	void salesReport();//displays the shows sales report
	
	~TicketManager();//deconstuctor
	
};
//end of class
#endif