import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			int totalScore = 0;
			int score = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					totalScore += score;
					score++;
				} else {
					score = 1;
				}
			}
			bw.write(String.valueOf(totalScore) + "\n");
		}
		bw.flush();

	}
}
