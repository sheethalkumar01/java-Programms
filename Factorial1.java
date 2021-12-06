//factorial programm with recursion
import java.util.Scanner;
class Factorial1
{	static int fact=1;
	static int factorial(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			fact=n*factorial(n-1);
		return fact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fact=factorial(n);
		System.out.println(fact);
	}
}