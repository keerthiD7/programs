package basic_programs.com;
import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>num)
		{
			System.out.println("AbundantNumber");
		}
		else
		{
			System.out.println("Not a AbundantNumber");
		}
	}

}
