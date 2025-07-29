package basic_programs.com;
import java.util.Scanner;

public class ArmStrongNumberinRange {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the low and high:");
		int low = sc.nextInt();
		int high = sc.nextInt();
		for(int i=low;i<=high;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
			
			
		}
	}
	public static boolean isArmstrong(int num)
	{
		int temp = num;
		int count =0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp = num;
		int sum=0;
		while(temp!=0)
		{
			int ld = temp%10;
			int exp=1;
			for(int i=1;i<=count;i++)
			{
				exp*=ld;
			}
			sum=sum+exp;
			temp = temp/10;
		}
		return sum==num;
	}

}
