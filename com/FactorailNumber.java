package basic_programs.com;
import java.util.Scanner;

public class FactorailNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int fact = 1;
		for(int i =1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
