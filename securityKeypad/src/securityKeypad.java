import java.util.Scanner;


public class securityKeypad {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num, guess;
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		System.out.println(" Enter the guess: ");
		guess=scan.nextInt();
		if(checkKey(num,guess))
		{
			System.out.println(" Allowed to enter...");
		}
		else
		{
			System.out.println(" Not allowed to enter...");
		}
	}
	
	public static boolean checkKey(int num, int guess)
	{
		int n1,n2, match=0,smatch=0, nomatch=0;
		while(num!=0)
		{
			n1=num%10;
			num=num/10;
			n2=guess%10;
			guess=guess/10;
			
			if(n2==n1)
			{
				match++;
			}
			else if((n2==n1-3)||(n2==n1+3)||(n2==n1-1)||(n2==n1+1))
			{
				smatch++;
			}
			else
			{
				nomatch++;
			}
		}
		
		if((nomatch>=1)||(smatch>=2))
		{
			return false;
		}
		else
			return true;
	}
}
