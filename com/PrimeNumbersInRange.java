package basic_programs.com;
import java.util.Scanner;

public class PrimeNumbersInRange {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ranges:");
		int low = sc.nextInt();
		int high = sc.nextInt();
		for(int i = low;i<high;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n )
	{
		if(n<2)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
		
		
	

}
