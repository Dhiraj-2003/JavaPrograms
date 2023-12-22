import java.util.Scanner;
public class Complex1
{

	public static void main(String[] args) 
	{
		double r1,r2,i1,i2;
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first complex real and imaginary part : ");
		r1=s.nextDouble();
		i1=s.nextDouble();
		System.out.println("Enter the Second complex real and imaginary part : ");
		r2=s.nextDouble();
		i2=s.nextDouble();
		
		
		Complex c1 = new Complex(r1,i1);
		Complex c2 = new Complex(r2,i2);
		Complex c3 = new Complex();
		
		do
		{
			System.out.println("Select the Option to perform operations on Complex numbers : ");
			System.out.println("1. To Add");
			System.out.println("2. To Substract");
			System.out.println("3. To Multiply");
			System.out.println("4. To Divide");
			System.out.println("5. To Exit");
		
			System.out.print("Enter Your Choice : ");
			n = s.nextInt();
			switch(n)
			{
			case 1 : // for addition
				System.out.println("\nAddition is : ");
				c3.add(c1,c2);
				c3.display();
				break;
				
			case 2 : // for substraction
				System.out.println("\nSubstraction is : ");
				c3.sub(c1,c2);
				c3.display();
				break;
				
			case 3 : //for multiplication
				System.out.println("\nMultiplication is : ");
				c3.mul(c1,c2);
				c3.display();
				break;
				
			case 4 : //for division
				System.out.println("\nDivision is : ");
				c3.div(c1,c2);
				c3.display();
				break;
				
			case 5 : 
				System.out.println("\nExited Successfully");
				break;
			default:
				System.out.println("\nPlease enter a valid option...");
			}
		}while(n!=5);
		s.close();
	}

}
