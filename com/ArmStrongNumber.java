package basic_programs.com;
import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		while(temp!=0)
		{
			count++;
			temp = temp/10;
		}
		temp = num;
		int sum=0;
		
		while(temp!=0)
		{
			int ld = temp%10;
			int exp=1;
			for(int i=1;i<=count;i++)
			{
				exp = exp*ld;
			}
			sum= sum+exp;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("armstrongnumber");
		}
		else
		{
			System.out.println("not a armstrongnumber");
		}
	}

}
