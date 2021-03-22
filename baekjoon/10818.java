import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			int caseNum = sc.nextInt();
			sc.nextLine();
			String[] str = sc.nextLine().split(" ");
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int i=0;i<str.length;i++) {
				int num = Integer.parseInt(str[i]);
				min = Math.min(num, min);
				max = Math.max(num, max);
			}
			System.out.println(min+" "+max);
	}
}
