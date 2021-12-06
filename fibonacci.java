//programm to generate fibonacci number without recursion
import java.util.Scanner;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=0,f2=1,f3,i=2;
		
		if(n==1)
		{
			System.out.print(f1);
		}
		else
		{
			System.out.print(f1+" "+f2+" ");
			while(i<n)
			{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			i++;
			}
		}
		
	}
}	
		