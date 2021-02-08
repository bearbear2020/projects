
#include "TicketManager.h"
#include "Theater.h"
#include "TicketManager.h"
#include <iostream> //needed for output
#include <string>//needed to handle any string needs in future
#include <cstring>//needed for the cstrings
#include <fstream> //needed for the file

using namespace std;
void displayOptions()
{
	cout << "Please choose an option below" << endl;
	cout << "Option 1: display the seat chart" << endl;
	cout << "Option 2: Request tickets" << endl;
	cout << "Option 3: Print Sales Report" << endl;
	cout << "Option 4: Curtain Call" << endl;
	cout << "Option 5: Refund Request" << endl;
	cout << "Option 6: Exit" << endl;
	cout << "Enter choice: ";
};
int main()
{
	TicketManager obj;
	//cout <<endl<< "Welcome to the " << obj.getName() << " Theater on "  <<obj.getLocation() << endl;
	char choice = 'Y';
	int menuChoice = 0;
	displayOptions();
	cin >> menuChoice;
	do
	{
		choice = 'N';
	
		switch (menuChoice)
		{
		case 1:
			cout << "Seat map is: " << endl;
			obj.getSeatMap();
			cout << endl;
			break;

		case 2:
		{
			char HowMany = 'N';
			int  row[10] = { 0 };
			int  col[10] = { 0 };
			int number = 0;
			cout << "What is the number of tickets desired: ";
			cin >> number;
		
			for (int x = 0; x < number; x++)
			{
				
				cout << "Enter the row and col for " << x + 1 << " ticket: ";
				cin >> row[x] >> col[x];
				char  temp = obj.getSeat(row[x], col[x]);
				if (temp == '*')
				{
					cout << "invaild try again";
					cin >> row[x] >> col[x];
				}

			}
			cout << "Still Fine with choices and buy? Y for yes, N for no: ";
			cin >> HowMany;
			if (HowMany == 'Y' || HowMany == 'y')
			{
				double totals = 0.0;
				for (int x = 0; x < number; x++)
				{
					bool stillAvail = false;

					stillAvail = obj.buySeat(row[x], col[x]);
					if (stillAvail)
					{
						totals += obj.getSeatCost(row[x], col[x]);
					}
				}
				cout << "System operator: collect $" << totals << endl;
			}
		}
			break;
		case 3:
			cout << "Report is being generated" << endl;
			obj.salesReport();
			break;
		case 4:
			obj.showStartedShow();
			cout << "Please find your seat(s)" << endl;
			break;

		case 5:
		{
			int r = 0;
			int c = 0;
			int userVal = 0;
			int count = 0;
			cout << "How amny Tickets do you want to get a refund: ";
			cin >> userVal;
			while (count < userVal)
			{
				cout << "Enter the row and column: ";
				cin >> r >> c;
				obj.refundTicket(r, c);
				count++;
			}
		}
				break;
		case 6:
			cout << "Hope you enjoyed the show!!" << endl;
			system("pause");
			return 0;
			break;

		default:
			choice = 'Y';
			cout << "Please enter any of the folloing numbers: {1,2,3,4,5,6}, Please try again with a vaild number" << endl;
			break;
		}

		displayOptions();
		cin >> menuChoice;
		if (menuChoice > 0 && menuChoice < 7)
		{
			choice = 'Y';
		}
		
	} while (choice == 'Y' || choice == 'y');
	
};