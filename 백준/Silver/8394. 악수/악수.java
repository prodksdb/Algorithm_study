import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        // n명이 앉아 있을 때, 악수하는 방법의 수는 f(n) (f(0)=1, f(1)=1, f(n)=f(n-1)+f(n-2))
        // 문제에서는 마지막 자리만 출력해야 하므로, 10으로 모듈러 연산을 합니다.
        
        // n이 1인 경우
        if (n == 1) {
            bw.write("1");
        } else {
            int mod = 10;
            // 초기값: f(0)=1, f(1)=1
            int a = 1;  // f(0)
            int b = 1;  // f(1)
            // 2부터 n까지 f(i)=f(i-1)+f(i-2)를 계산
            for (int i = 2; i <= n; i++) {
                int c = (a + b) % mod;
                a = b;
                b = c;
            }
            bw.write(String.valueOf(b));
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
