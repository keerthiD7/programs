package basic_programs.com;
import java.util.Scanner;

public class LeapYearorNot {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if((year%400==0)||(year%4==0&&year%100!=0))
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" is not a Leap Year");	
		}
	}

}
