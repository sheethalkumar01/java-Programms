import java.util.Scanner;
class Armstrong
{
	static Boolean isarm(int n)
	{
		int temp,dig=0,sum=0,last;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			dig++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum+=Math.pow(last,dig);
			temp=temp/10;
		}
		if(sum==n)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
			
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(isarm(i))
			{
				System.out.println(i);
			}
		}
	}
}