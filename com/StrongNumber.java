package basic_programs.com;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(temp!=0)
		{
			int ld = temp%10;
			int prd = 1;
			for(int i=1;i<=ld;i++)
			{
				prd=prd*i;
			}
			sum=sum+prd;
			temp = temp/10;
		}
		if(sum==num)
		{
			System.out.println("strong number");
			
		}
		else
		{
			System.out.println("not a strong number");
		}
	
	}

}
