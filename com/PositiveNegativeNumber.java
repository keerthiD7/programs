package basic_programs.com;
import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}
	}

}
