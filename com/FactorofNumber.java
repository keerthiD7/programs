package basic_programs.com;
import java.util.Scanner;

public class FactorofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
