import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int res=1;
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			res=res*i;
		}
		System.out.println(res);
	}
}	