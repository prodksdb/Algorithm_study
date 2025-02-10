import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().trim().split(" ");
		int M = Integer.parseInt(input1[0]);
		int N = Integer.parseInt(input1[1]);

		String[] input2 = br.readLine().trim().split(" ");
		int[] snack = new int[N];
		for (int i = 0; i < N; i++) {
			snack[i] = Integer.parseInt(input2[i]);

		}

		Arrays.sort(snack);

		int left = 1; // 최소 길
		int right = snack[N - 1]; // 최대 길이
		int result = 0; // 최적의 길이

		while (left <= right) {
			int mid = (left + right) / 2;
			int count = 0;

			for (int i = 0; i < N; i++) {
				count += snack[i] / mid;
			}

			if (count >= M) {
				result = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}
