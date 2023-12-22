#include <iostream> 
using namespace std;
class feetinch;
class metercentimeter
{
	int m,cm;
	public:
		metercentimeter(int , int);
		void display();	
		friend metercentimeter add(metercentimeter m,feetinch f);
		friend metercentimeter sub(metercentimeter m,feetinch f);
		friend feetinch add(feetinch f,metercentimeter m);
		friend feetinch sub(feetinch f,metercentimeter m);
};
class feetinch
{
	int ft,in;
	public:
		feetinch(int , int);
		void output();
		friend metercentimeter add(metercentimeter m,feetinch f);
		friend metercentimeter sub(metercentimeter m,feetinch f);
		friend feetinch add(feetinch f,metercentimeter m);
		friend feetinch sub(feetinch f,metercentimeter m);
};


metercentimeter::metercentimeter(int m ,int cm)
{
	this->m=m;
	this->cm=cm;
}

void metercentimeter::display()
{
	cout<<"\nMeter is :"<<m<<"\nCentimeter is :"<<cm;	
}



feetinch::feetinch(int ft, int in)
{
	this->ft=ft;
	this->in=in;
}

void feetinch::output()
{
	cout<<"\nFeet is :"<<ft<<"\nInch is :"<<in;	
}

metercentimeter add(metercentimeter m,feetinch f)
{	
	float sum;
	metercentimeter temp(0,0);
	sum= m.m*100 + m.cm + f.ft*30.48 + f.in*2.54;
	int result = sum;
	temp.m=result/100;
	temp.cm=result%100;
	return temp;
}

metercentimeter sub(metercentimeter m,feetinch f)
{

	float s;
	int result;
	metercentimeter temp(0,0);
	s= (m.m*100 + m.cm)-(f.ft*30.48 + f.in*2.54);
	result = s;
	temp.m=result/100;
	temp.cm=result%100;
	return temp;
}

feetinch add(feetinch f,metercentimeter m)
{
	float sum;
	int result;
	feetinch temp(0,0);
	sum= m.m*39.37 + m.cm*0.394+f.ft*12 + f.in;
	result = sum;
	temp.ft=result/12;
	temp.in=result%12;
	return temp;
}

feetinch sub(feetinch f,metercentimeter m)
{
	float s;
	int result;
	feetinch temp(0,0);
	s= ((m.m*39.37)+(m.cm*0.394))-((f.ft*12) + (f.in));
	result = s;
	temp.ft=result/12;
	temp.in=result%12;
	return temp;
}

int main()
{	
	int m,cm,ft,in,ch;
	cout<<"Enter the length in meter: ";
	cin>>m;
	cout<<"Enter the length in centimeter: ";
	cin>>cm;
	metercentimeter m1(m,cm),m2(0,0),m3(0,0);
	cout<<"Enter the length in feet: ";
	cin>>ft;
	cout<<"Enter the length in inches: ";
	cin>>in;
	feetinch f1(ft,in),f2(0,0),f3(0,0);
	cout<<"\nEntered Data is : ";
	m1.display();
	f1.output();
	/*cout<<"\nSum in Meter & Centimeter is : ";
	m2=add(m1,f1);
	m2.display();
	cout<<"\nSum in Feet & Inch is : ";
	f2=add(f1,m1);
	f2.output();
	cout<<"\nDifference in Meter & Centimeter is : ";
	m3=sub(m1,f1);
	m3.display();
	cout<<"\nDifference in Feet & Inch is : ";
	f3=sub(f1,m1);
	f3.output();*/ 
	
	do
	{
	    cout<<"\n";
		cout<<"\nChoose the option : ";
		cout<<"\n1.To perform addition in Meter & Centimeter.";
		cout<<"\n2.To perform addition in Feet & Inch.";
		cout<<"\n3.To perform Substraction in Meter & Centimeter.";
		cout<<"\n4.To perform Substraction in Feet & Inch.";
		cout<<"\n5.To exit.";
		cout<<"\nSelect your operation to perform : ";
		cin>>ch;
		
		switch(ch)
		{
			case 1: 
				cout<<"\nSum in Meter & Centimeter is : ";
				m2=add(m1,f1);
				m2.display();
				break;
			case 2:
				cout<<"\nSum in Feet & Inch is : ";
				f2=add(f1,m1);
				f2.output();
				break;
			case 3:
				cout<<"\nDifference in Meter & Centimeter is : ";
				m3=sub(m1,f1);
				m3.display();
				break;
			case 4: 
				cout<<"\nDifference in Feet & Inch is : ";
				f3=sub(f1,m1);
				f3.output();
				break;
			case 5:
			    cout<<"\nExited Successfully...";
			    break;
			default : cout<<"\nPlease Enter a valid option.";	
		}
	}while(ch!=5);
}
