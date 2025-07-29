package basic_programs.com;
import java.util.Scanner;

public class AutpmorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean isAutomorphic = false;
		int square = num*num;
		while(square!=0)
		{
			
			int ld = square%10;
			if(ld==num)
			{
				isAutomorphic = true;
			}
			square = square/10;
			
		}
		if(isAutomorphic==true)
		{
			System.out.println("AutomorphicNumber");
		}
		else
		{
			System.out.println("Not a AutomorphicNumber");
		}
		

	}

}
