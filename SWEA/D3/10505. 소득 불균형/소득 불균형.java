import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case).append(" ");

            int N = Integer.parseInt(br.readLine().trim());
            int[] number = new int[N];
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < N; i++) {
                number[i] = Integer.parseInt(st.nextToken());
                sum += number[i];
            }

            double average = (double) sum / N;
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (number[i] <= average) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        // 결과 출력
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}