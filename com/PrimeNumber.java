package basic_programs.com;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i =2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				break;
			}
			
		}
		if(isPrime==true)
		{
			System.out.println("It is Prime Number");
		}
		else
		{
			System.out.println("It is not a prime NUmber");
		}

	}

}
