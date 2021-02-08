#include "TicketCost.h"
using namespace std;

double TicketCost::SalesTax = 0.086;

TicketCost::TicketCost()//default constuctor
{
	this->cost = 1; //sets the cost to a default value of $1
}

TicketCost::TicketCost(double cost) //overloaded constuctor that sets the ticket cost to the user defined value
{
	this->cost = cost; //sets users cost to the TicketCost
}

double TicketCost::getSalesTax() //returns the sales tax value
{
	return this->SalesTax; //returns sales tax
}

double TicketCost::getCost() //method to get the cost
{
	return this->cost; //returns the cost
}

void TicketCost::setCost(double cost)//method to get the new cost, or update cost
{
	this->cost = cost;//sets cost, or updates cost
}

double TicketCost::getGrandTotal()//gets the grand total, cost plus tax
{
	double temp = 0;
	temp = cost;
	temp = cost + (cost * SalesTax);
	return temp;//returns cost plus tax
}