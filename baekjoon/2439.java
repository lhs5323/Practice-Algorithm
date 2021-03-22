import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			int line = sc.nextInt();
			int count = 0;
			for(int i=0;i<line;i++) {
				for(int j=line-1;j>=0;j--) {
					if(i>=j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
}
