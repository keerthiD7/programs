package basic_programs.com;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number:");
		int num = sc.nextInt();
		int temp=num;
		int rev = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev = rev*10+ld;
			temp = temp/10;
			
		}
		if(num==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
