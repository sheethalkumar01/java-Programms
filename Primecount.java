import java.util.Scanner;
class Primecount
{
	
			
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		if(n<2)
		{
			System.out.println("count="+"0");
		}
		else if(n==2)
		{
			System.out.println("count=1");
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					System.out.println(i);
				}
			}
		}
			
			
				
		
		
	}
}