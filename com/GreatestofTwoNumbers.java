package basic_programs.com;
import java.util.Scanner;

public class GreatestofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers One by One:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" is the greatest number");
		}
		else
		{
			System.out.println(n2+" is the greatest number");
		}

	}

}
