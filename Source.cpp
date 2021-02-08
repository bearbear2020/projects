//Trent Giever
//Compiler MS VS community 2017
//Purpose: Teach and practice vector<T>
#include <iostream>
#include <string>
#include <vector> //needed for vector class
using namespace std;

template <class T>//Template for accum method
T accum(vector <T> v)//method to add together a vector array
{
	T sum = T();//creates a sum variable of the type T
	
	for (int i = 0; i < v.size(); i++) //loop through the vector
	{
		 sum += v[i];//add element to the T sum variable
	}
	return sum; //returns the sum of type T
}

int main() //main
{
	vector<int> v1 = { 1,2,3,4,5,6,7,8,9,10 };// int vector
	vector<double> v2 = { 1,1.5,2,2.5,3,3.5,4,4.5,5 };//double vector
	vector<string> v3 = { "a", "b","c" };//string vector
	//felt lazy, so it is a predefined array that could easily be user provided with a loop and push_back
	int sumInt = accum(v1);//calls the accum method
	double sumDouble = accum(v2);//calls the accum method
	string sumString = accum(v3);//calls the accum method
	cout << "First sum is: " << sumInt << endl; //output of the accum results
	cout << "Second sum is: " << sumDouble << endl;//output of the accum results
	cout << "Third sum is: " << sumString << endl;//output of the accum results
	system("pause");//pause screen
	return 0;//clean exit
};//end of program