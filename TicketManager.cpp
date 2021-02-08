#include "TicketManager.h"
using namespace std;

char TicketManager::fileName[15] = "Seats.dat"; //filename

TicketManager::TicketManager()//default and prefered constructor
{
	startUp(); //calls a method to do statup process
	welcome();//method in Theater class to display the welcome info
}

TicketManager::TicketManager(char *name, char *location) : Theater(name, location)//overloaded constructor
{
	startUp();//calls a method to do startup process
	welcome(); //method in Theater class to display the welcome info
}

void TicketManager::startUp()//constuctors shared startup method
{
	char choice; //used to create new or existing
	cout << "Do you want to start a new show seating or open up existing: Y for New and N for Existing: ";
	cin >> choice; //users choice
	SeatsSold.open(fileName, ios::in | ios::out | ios::binary); //open the file
	if (!SeatsSold)//exit if error
	{
		cout << "Error opening file \n";
		system("pause");
		exit(1);
	}
	if (choice == 'Y' || choice == 'y') //if new
	{
		for (int r = 0; r < 15; r++)
		{
			for (int c = 0; c < 30; c++)
			{
				seatArray[r][c] = '#';//all seats available
			}
		}
		double costofrow = 0;//cost per row
		double algorithm = 1.5;//rows cost increases closer to middle
		cout << "What is the cost for row cost algorithm based on popularity: ";
		cin >> costofrow;//user choices the top and bottom rowws value
		for (int r = 0; r < 15; r++)
		{
			for (int c = 0; c < 30; c++)
			{
				if (r < 8) //0-7
					seatCost[r][c].setCost(costofrow);//sets row cost

				else//8-15
					seatCost[r][c].setCost(costofrow);//sets row cost

			}

			if (r < 8)
			{
				costofrow += algorithm;//cost increases
				algorithm += 1.5;//cost increases
			}
			else
			{
				costofrow -= algorithm;//cost decreases
				algorithm -= 1.5;//cost decreases
			}
		}
		char  name[80], location[80];
		cin.ignore();
		cin.get();
		cout << "What is the name for the Movie theater: ";
		cin.getline(name, 80);
		cin.ignore();
		cin.get();
		cout << "What is the Address/Location: ";
		cin.getline(location, 80);
		cin.ignore();
		cin.get();
		setName(name);
		setLocation(location);
	}

	else//else open up existing file
	{

		SeatsSold.read(reinterpret_cast<char *>(&seatArray), (15 * 30) * sizeof(char));//read in seats
		double tempCost[15][30];//temp for storage to be written back into the Ticketcost class
		SeatsSold.read(reinterpret_cast<char *>(tempCost), (15 * 30) * sizeof(double)); //assigns ticket costs to temp
		for (int r = 0; r < 15; r++)
		{
			for (int c = 0; c < 30; c++)
			{
				seatCost[r][c].setCost(tempCost[r][c]);//reassigns the ticketCost/seat costs to each of the row and columns
			}
		}
		char name[80], location[80];
		SeatsSold.read(reinterpret_cast<char *>(name), 80 * sizeof(char));//read in name
		SeatsSold.read(reinterpret_cast<char *>(location), 80 * sizeof(char));//reas in location
		setName(name);//setname
		setLocation(location);//setlocation
	}
}

char TicketManager::getSeat(int r, int c)//returns the  seat availability
{
	r--; //users are not going to enter a 0 for row1, etc..
	c--; //users are not going to enter a 0 for row1, etc..
	try
	{
		return seatArray[r][c]; //returns * or #
	}
	catch (OutOfRange)//if out of boands throw
	{
		cout << "not valid";
		system("pause");
		exit(1);
	}
}

bool TicketManager::buySeat(int r, int c)//15x30
{
	r--; //users are not going to enter a 0 for row1, etc..
	c--; //users are not going to enter a 0 for row1, etc..
	double temp = 0;//temp variable
	bool success = false; //if sold or failed
	try
	{
		if (seatArray[r][c] == '#')//if available then
		{
			success = true; //success
			seatArray[r][c] = '*';//change the seat to sold
			temp = seatCost[r][c].getGrandTotal(); //gets ticket total
			cout << "Cost is :" << fixed << setprecision(2) << temp << endl;//output tax
			cout << "System operator: open cash drawer or take credit card for " << temp << endl;//pay
		}
		else//if a sold seat
		{
			cout << "Seat is already sold, please pick a different one " << endl;//try again
		}
		return success;//return successful or not
	}
	catch (OutOfRange)//if out of boands throw
	{
		cout << "not valid";
		system("pause");
		exit(1);
	}
}

void TicketManager::writeToFile() //write the data to the file
{
	SeatsSold.clear();

	SeatsSold.write(reinterpret_cast<char *>(seatArray), (15 * 30) * sizeof(char)); //write seats
	double tempCost[15][30];//creates temp to hold and pass each seats cost
	for (int r = 0; r < 15; r++)
	{
		for (int c = 0; c < 30; c++)
		{
			tempCost[r][c] = seatCost[r][c].getCost();//sets the cost for each seat to the coresponding r and c of temp array
		}
	}
	SeatsSold.write(reinterpret_cast<char *>(tempCost), (15 * 30) * sizeof(double));//writes the temp array to the file
	SeatsSold.write(reinterpret_cast<char *>(getName()), 80 * sizeof(char));//write name
	SeatsSold.write(reinterpret_cast<char *>(getLocation()), 80 * sizeof(char));//write location
}

void TicketManager::getSeatMap() //draws seat map
{
	cout << "          Seats" << endl; //header
	cout << "         123456789012345678901234567890" << endl; //seat numbers at the top

	for (int r = 0; r < 15; r++)//loops through all 15 rows
	{

		cout << "Row " << setw(3) << r + 1 << "  ";//prints the row name
		for (int c = 0; c < 30; c++)
		{
			cout << seatArray[r][c];//draws a # or a * after the row name

		}
		cout << endl;//ends the row
	}
}

void TicketManager::setSeatCost(int r, int c, double cost)//sets the cost of the seat
{
	r--; //users are not going to enter a 0 for row1, etc..
	c--; //users are not going to enter a 0 for row1, etc..
	try//if vaild seat index
	{
		seatCost[r][c].setCost(cost); //sets the cost
	}
	catch (OutOfRange)//else throws it out
	{
		cout << "Enter valid number";
		system("pause");
		exit(1);
	}
}

void TicketManager::setSeatCost(int r, double cost) //sets the cost for the row
{
	r--; //users are not going to enter a 0 for row1, etc..
	try //if vaild
	{
		for (int c = 0; c < 30; c++) //loops through the rows seats
			seatCost[r][c].setCost(cost);//all seats in row has same value
	}
	catch (OutOfRange)//if out of bounds
	{
		cout << "Enter valid number";
		system("pause");
		exit(1);
	}
}

double TicketManager::getSeatCost(int r, int c)//returns the cost for a seat
{
	r--; //users are not going to enter a 0 for row1, etc..
	c--; //users are not going to enter a 0 for row1, etc..
	double total = 0;//total temp var
	try//if valid
	{
		total = seatCost[r][c].getGrandTotal();//cost
	}
	catch (OutOfRange)//problems then it exits
	{
		cout << "Enter valid number";
		system("pause");
		exit(1);
	}
	return total;
}

void TicketManager::showStartedShow()//used to deny refunds once show has started
{
	showStarted = true;//sets value to true
}

void TicketManager::refundTicket(int r, int c)//determines a refund based on show started and not an empty seat
{
	r--; //users are not going to enter a 0 for row1, etc..
	c--; //users are not going to enter a 0 for row1, etc..
	try//if valid
	{
		if (!showStarted && seatArray[r][c] == '*')//if not empty or show started
		{
			double refund = seatCost[r][c].getGrandTotal();//get cost
			seatArray[r][c] = '#';//change seat to open 
			cout << "Refund is: " << fixed << setprecision(2) << refund << endl;//output refund
			cout << "System Operator: cash drawer(open) || card=insert" << endl;//cash give back
		}
	}
	catch (OutOfRange)//if problems
	{
		cout << "Error, need to restart program";
		system("pause");
		exit(1);
	}
}

void TicketManager::salesReport()//displays the shows sales report
{
	double total = 0;//total revenue
	int sold = 0, available = 0;//based on seats sold and open
	for (int r = 0; r < 15; r++)
	{
		for (int c = 0; c < 30; c++)
		{
			if (seatArray[r][c] == '#')//if open
			{
				available++;//open seat++
			}
			else if (seatArray[r][c] == '*')//if filled
			{

				total += seatCost[r][c].getGrandTotal();//gets total

				sold++;//warm seat+1
			}
		}
	}
	cout << "Total Tickets sold: " << sold << endl;//filled seats
	cout << "Available Tickets: " << available << endl;//open seats to be filled
	cout << "Total Profit: " << total << endl;//profit
}

TicketManager::~TicketManager()//deconstuctor
{
	writeToFile();//write/save changes
	SeatsSold.close();//clode file
}