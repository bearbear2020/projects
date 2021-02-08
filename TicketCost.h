#pragma once
#ifndef TICKETCOST_H
#define TICKETCOST_H
//defines the TicketCost header file
#include <iostream> //needed if needing to output to the screen for testing
using namespace std;

class TicketCost //TicketCost class, used in has-a relationship
{
private:
	double cost; //cost of the seat
	static double SalesTax; //could be any number for sales tax, but const so a user does not enter like a negative number and gets a refund
public:
	TicketCost();//default constuctor
	
	TicketCost(double cost); //overloaded constuctor that sets the ticket cost to the user defined value

	double getSalesTax(); //returns the sales tax value
	
	double getCost(); //method to get the cost
	
	void setCost(double cost);//method to get the new cost, or update cost
	
	double getGrandTotal();//gets the grand total, cost plus tax
	

	
};


//end of ticketCost Class
#endif