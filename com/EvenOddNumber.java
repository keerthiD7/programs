package basic_programs.com;
import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
	}

}
