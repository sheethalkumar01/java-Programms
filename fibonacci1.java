import java.util.Scanner;
class Fibonacci1
{
	int fib(int n)
	{
		if(n==0||n==1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String args[])
	{
		int f1=0,f2=1,g3;
		Fibonacci1 p1=new Fibonacci1();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			
		for(int i=0;i<n;i++)
			System.out.print(p1.fib(i)+" ");
		
	}
}