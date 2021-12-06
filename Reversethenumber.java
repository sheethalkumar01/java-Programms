import java.util.Scanner;
class Reversethenumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int rev=0,dig;
		while(n>0)
		{
			dig=n%10;
			rev=(rev*10)+dig;
			n=n/10;
		}
		System.out.print(rev);
	}
}