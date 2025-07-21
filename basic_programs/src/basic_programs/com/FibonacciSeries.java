package basic_programs.com;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int a =0;
		int b=1;
		int sum=0;
		for(int i=0;i<num;i++)
		{
			System.out.println(sum);
			a =b;
			b=sum;
			sum=a+b;
			
		}
		

	}

}
