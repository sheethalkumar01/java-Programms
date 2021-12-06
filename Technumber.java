import java.util.Scanner;
class Technumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,dig=0,num;
		while(temp>0)
		{
			dig++;
			temp=temp/10;
		}
		if(dig%2==0)
		{
			num=n;
			int a1=num%(int)Math.pow(10,dig/2);
			int a2=num/(int)Math.pow(10,dig/2);
			System.out.println(a1);
			System.out.println(a2);
			int res=a1+a2;
			int res1=res*res;
			if(res1==n)
			{
				System.out.println("a tech number");
			}
			else
			{
				
				System.out.println("not a tech number");
			}
		}
	}
}