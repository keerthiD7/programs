package basic_programs.com;
import java.util.Scanner;

public class SumofDigits {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0)
		{
			int lastdigit = num%10;
			sum = sum+lastdigit;
			num = num/10;
		}
		System.out.println(sum);
		
	}

}
