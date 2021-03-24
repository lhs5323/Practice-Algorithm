import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] agrs) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);

		
		
		
		bw.write(String.valueOf((A+B)%C)+"\n");
		bw.write(String.valueOf(((A%C)+(B%C))%C)+"\n");
		bw.write(String.valueOf((A*B)%C)+"\n");
		bw.write(String.valueOf(((A%C)*(B%C))%C)+"\n");
		bw.flush();
	}
}
