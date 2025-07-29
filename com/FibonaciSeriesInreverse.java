package basic_programs.com;
import java.util.Scanner;

public class FibonaciSeriesInreverse {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n:");
		int n = sc.nextInt();
		int []fib = new int[n];
	    fib[0]=0;
	    if(n>1)
	    {
	    	fib[1]=1;
	    	for(int i=2;i<n;i++)
	    	{
	    		fib[i]=fib[i-1]+fib[i-2];
	    	}
	    }
	    System.out.println("fibonaciseries in reverse order:");
	    for(int i=n-1;i>=0;i--)
	    {
	    	System.out.println(fib[i]);
	    }
		
		
		
	}

}
