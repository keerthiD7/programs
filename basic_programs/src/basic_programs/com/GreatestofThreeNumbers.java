package basic_programs.com;
import java.util.Scanner;

public class GreatestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers one by one");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2&&n1>n3)
		{
			System.out.println(n1+" is the greatest number");
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println(n2+" is the greatest number");
		}
		else
		{
			System.out.println(n3+" is the greatest number");
		}
		

	}

}
