package basic_programs.com;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");  // 3 spaces to align with " * "
				}
			}
			System.out.println(); // New line after each row
		}
	}
}
