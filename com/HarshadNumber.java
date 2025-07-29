package basic_programs.com;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum =0;
		while(num!=0)
		{
			int ld = num%10;
			sum=sum+ld;
			num = num/10;
		}
		if(num%sum==0)
		{
			System.out.println("HarshadNumber");
		}
		else
		{
			System.out.println("Not a HarshadNumber");
		}
		
	}

}
