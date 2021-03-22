import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			String str = sc.next();
			int num2 = Integer.parseInt(str);
			String[] strArr = str.split("");
			for(int i=2;i>=0;i--) {
				System.out.println(num1*Integer.parseInt(strArr[i]));
			}
		
			System.out.println(num1*num2);
			
	}
}
