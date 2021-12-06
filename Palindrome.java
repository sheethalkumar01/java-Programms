//Programm to  reverse the number and checking palindrome
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,dig;
		int temp=n;
		while(n>0)
		{
			dig=n%10;
			rev=(rev*10)+dig;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("given number palindrome");
		}
		else
		{
			System.out.println("given number not a palindrome");
		}
	}
}			