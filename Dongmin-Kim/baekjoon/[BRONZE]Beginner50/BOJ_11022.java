package beginner50;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_11022 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st;

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine() + " ");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());

                bw.write("Case #" + (i+1) + ": " + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
            }
            br.close();

            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}