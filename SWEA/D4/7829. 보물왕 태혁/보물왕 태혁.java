import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스 개수 입력

        for (int t = 1; t <= T; t++) {
            int P = Integer.parseInt(br.readLine().trim()); // 약수 개수
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 약수의 최솟값과 최댓값 찾기
            int minFactor = Integer.MAX_VALUE;
            int maxFactor = Integer.MIN_VALUE;

            for (int i = 0; i < P; i++) {
                int factor = Integer.parseInt(st.nextToken());
                minFactor = Math.min(minFactor, factor);
                maxFactor = Math.max(maxFactor, factor);
            }

            // 원래 숫자 N = 최솟값 × 최댓값
            int N = minFactor * maxFactor;

            // 결과 출력
            bw.write("#" + t + " " + N + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}