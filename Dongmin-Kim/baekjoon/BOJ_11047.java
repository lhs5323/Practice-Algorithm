package greedy50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class BOJ_11047{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i, m = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int coin[] = new int[n + 1];

        for (i = 1; i <= n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(i=n;i>0;i--){
            m+=k/coin[i];
            k%=coin[i];
        }
        System.out.println(m);
    }
}