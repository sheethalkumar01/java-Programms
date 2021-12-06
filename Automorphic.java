//programm to check an automorphic method
import java.util.Scanner;
class Automorphic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int square=n*n;
		int count=0;
		int temp=n;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int lastdigit=(int)(square%(Math.pow(10,count)));
		if(n==lastdigit)
		{
			System.out.println("a automorphic number");
		}
		else
		{
			System.out.println("not a automorphic numberr");
		}
	}
}	
			
			
		
		
	