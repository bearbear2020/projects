#include <iostream>
#include <vector>
using namespace std;

class grades
{
private: 
	vector<int> scores;
	

public:
	grades()
	{
		import();

	}
	void import ()
	{
		for (int i =0; i < 8; i++)
		{
			int temp =0;
			cin >> temp;
				scores.push_back(temp);
		}

	}
	void getGrades()
	{
		for (int i =0; i < scores.size(); i++)
			cout << scores(i) << endl;
	}
	
};

int main ()
{
	grades program;
	program.getGrades();
	//system("pause");
	return 0;
};