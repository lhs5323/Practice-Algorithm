import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner scan = new Scanner(System.in);
			int burger = 2000;
			int drink = 2000;
			for(int i=0;i<5;i++) {
				if(i<3) {
					burger = Math.min(burger, scan.nextInt());
				}
				else {
					drink = Math.min(drink, scan.nextInt());
				}
			}
			System.out.println(burger+drink-50);
	}
}
