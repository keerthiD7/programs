package basic_programs.com;
import java.util.Scanner;
public class SumofNumbersinRange {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower Range");
		int low = sc.nextInt();
		System.out.println("Enter the high Range");
		int high = sc.nextInt();
		int sum = 0;
		for(int i=low;i<=high;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
