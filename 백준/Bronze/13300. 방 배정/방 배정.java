import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수 입력 받기
        String[] input = br.readLine().trim().split(" ");
        int N = Integer.parseInt(input[0]);  // 학생 수
        int K = Integer.parseInt(input[1]);  // 한 방에 배정할 수 있는 최대 인원 수

        // 학년별 여학생 수, 학년별 남학생 수
        int[] girls = new int[7];
        int[] boys = new int[7];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken()); // 성별 : 여학생 0, 남학생 1
            int Y = Integer.parseInt(st.nextToken()); // 학년 : 1~6

            if (S == 0) {
                girls[Y]++;
            } else {
                boys[Y]++;
            }
        }

        // 최소한의 방의 수 구하기
        int count = 0;
        // 1. 여학생
        for (int i = 1; i <= 6; i++) {
            if (girls[i] == 0) {
                continue;
            } else {
                if (girls[i] % K == 0) {
                    count += girls[i] / K;
                }else{
                    count += girls[i] / K + 1;
                }
            }
        }

        // 2. 남학생
        for (int i = 1; i <= 6; i++) {
            if (boys[i] == 0) {
                continue;
            } else {
                if (boys[i] % K == 0) {
                    count += boys[i] / K;
                }else{
                    count += boys[i] / K + 1;
                }
            }
        }
        System.out.println(count);
    }
}