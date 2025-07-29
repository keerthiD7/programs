package basic_programs.com;
import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sumA=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				sumA=sumA+i;
			}
		}
		
		
		int sumB=0;
		for(int i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				sumB=sumB+i;
			}
		}
		
		if(sumA*b==sumB*a)
		{
			System.out.println("friendlypair");
		}
		else
		{
			System.out.println("not a friendlypair");
		}


	}

}
