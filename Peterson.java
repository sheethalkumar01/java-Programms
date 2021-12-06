import  java.util.Scanner;
class Peterson
{
	 static int factorial(int n)
	{
		int res=1;
		for(int i=n;i>0;i--)
		{
			 res=res*i;
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int temp=n,sum=0;
		while(temp>0)
		{
			int d=temp%10;
			sum+=factorial(d);
			temp=temp/10;
			
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("number is peterson");
		}
	}
}
		
				
		