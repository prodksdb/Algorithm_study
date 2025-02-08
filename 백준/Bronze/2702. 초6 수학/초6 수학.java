import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine().trim());
		// 입력 처리
		for (int test_case = 1; test_case <= T; test_case++) {
			String[] input = br.readLine().trim().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int maxNum = Integer.MIN_VALUE;
			for (int i = 1; i <= a; i++) {
				if (b % i == 0 && a % i == 0) {
					maxNum = i;
				}
			}
			
			int minNum = (a / maxNum) * (b / maxNum) * maxNum;
			
			bw.write(String.valueOf(String.valueOf(minNum))+" "+ String.valueOf(maxNum));
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
