import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] agrs) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum=0;
		for(int i=1;i<=5;i++) {
			int score = Integer.parseInt(br.readLine());
			System.out.println(score);
			if(score<40) {
				score=40;
			}
			sum+=score;
		}
		
		bw.write(String.valueOf(sum/5));
		bw.flush();
	}
}
