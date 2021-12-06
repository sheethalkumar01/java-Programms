//Programm to count the prime number
import java.util.Scanner;
class Count
{
	static boolean isprime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
			
		}
		return true;
	}
	public static int count(int n)
	{
		if(n<3)
		{
			return 0;
		}
		int cnt=1;
		for(int i=3;i<n;i++)
		if(isprime(i))
			cnt++;
		return cnt;
	}
			
	public static void main(String args[])
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
	}
}	
		