import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
		Scanner scan = new Scanner(System.in);
		int test_case = scan.nextInt();
		for(int i=1; i<=test_case; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		}
			
	}
}
