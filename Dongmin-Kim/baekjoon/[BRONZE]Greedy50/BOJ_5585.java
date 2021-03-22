package greedy50;

import java.util.*;

public class BOJ_5585{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] yen = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        int pay = sc.nextInt();
        int sum = 1000 - pay;

        int i = 0;

        while(true) {
            if(sum == 0) break;

            if(sum >= yen[i]) {
                cnt += sum / yen[i];
                sum %= yen[i];
                i++;
            }else {
                i++;
                continue;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}