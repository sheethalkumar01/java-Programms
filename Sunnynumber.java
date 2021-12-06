//programm to check that given number has exact square root
import java.util.Scanner;
class Sunnynumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n=n+1;
		double res=Math.sqrt(n);
		System.out.println(res);
		if(res%1==0)
			System.out.println("a sunny number");
		else
			System.out.println("not a sunny number");
	}
}