//programm to check the number prime or not
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<=1)
		{
			System.out.println("not a prime number");
		}
		else if(n==2)
		{
			System.out.println(" prime number");
		}
		else
		{
	
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				
				flag=1;
				break;

			}
			
		}
		
		

		if(flag==1)
		{
			System.out.println("the given number is not a prime");
		}
		else
		{
			System.out.println("the given number is  a prime");
		}
		}
	}
	
}