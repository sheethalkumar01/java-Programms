import java.util.Scanner;
class Spalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}