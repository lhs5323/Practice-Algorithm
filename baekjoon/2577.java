import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] agrs) throws IOException{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result = Integer.toString(a*b*c);
			int[] arr = new int[10];
			
			//문자의 값이 곧 인덱스라고 생각하고 접근
			for(int i=0;i<result.length();i++) {
				int index = Integer.parseInt(result.charAt(i)+"");
				arr[index]++;
			}
			
			for(int num :arr) {
				System.out.println(num);
			}
			
			
	}
}
