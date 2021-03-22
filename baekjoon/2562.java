import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			int max = 0;
			int st = 1;
			for(int i=1;i<10;i++) {
				int num = sc.nextInt();
				if(num > max) {
					max = num;
					st = i;
				}
			}
			System.out.println(max);
			System.out.println(st);
	}
}
