//printing prime number between the ranges
import java.util.Scanner;
class Primeno
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count;
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
				System.out.println(i);	
		}
	}
}