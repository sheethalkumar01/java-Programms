//Programm to guess the Random number
import java.lang.Math;
import java.util.Scanner;
class Randnumber
{	
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		int n=(int)(Math.random()*10);
		while(count<3)
		{
			System.out.println("guess the number"); 
			int guess=sc.nextInt();
			if(n==guess)
			{
				System.out.println("you are legend");
				break;
	
			}
			else if(guess>n)
			{
				int m=Math.abs(n-guess);
				System.out.print(m);
				System.out.println("number is less");
			}
			else
			{
				int m=Math.abs(n-guess);
				System.out.print(m);
				System.out.println("number is more");
			}
			
		
		count++;
		if(count>2)
			System.out.println("Better luck next Time");
		}
		
	
	}
}
		  