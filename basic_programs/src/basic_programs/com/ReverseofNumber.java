package basic_programs.com;
import java.util.Scanner;

public class ReverseofNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			int ld = num%10;
			rev = rev*10+ld;
			num = num/10;
		}
		System.out.println(rev);
	}

}
