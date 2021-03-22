import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			String[] str = sc.nextLine().split(" ");
			int[] arr = new int[3];
			for(int i=0;i<3;i++) {
				arr[i]=Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			
			System.out.println(arr[1]);
	}
}
