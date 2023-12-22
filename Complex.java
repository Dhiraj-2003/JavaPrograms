import static java.lang.Math.pow ;

public class Complex {
	private double real,img;
	
	//Default constructor.
	public Complex()
	{
		real=0;
		img=0;
	}
	//Parameterized constructor.
	public Complex(double real,double img)
	{
		this.real=real;
		this.img=img;
	}
	
	public void add(Complex c1,Complex c2)
	{
		real = c1.real + c2.real;
		img = c1.img + c2.img;
	}
	
	public void sub(Complex c1,Complex c2)
	{
		real = c1.real - c2.real;
		img = c1.img - c2.img;
	}
	
	public void mul(Complex c1,Complex c2)
	{
		real = (c1.real*c2.real) - (c1.img*c2.img);
		img = (c1.real*c2.img) + (c1.img*c2.real);
	}
	
	public void div(Complex c1,Complex c2)
	{
		real = (c1.real*c2.real + c1.img*c2.img)/(pow((c2.real),2)+pow((c2.img),2));
		img = (c1.img*c2.real - c1.real*c2.img)/(pow((c2.real),2)+pow((c2.img),2));
	}
	public void display()
	{
		System.out.println(real+"+"+img+'i');
	}
}
