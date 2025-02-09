import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	static int N;

	static int recursion(int row, int col, int[][] grid, int size) {
		List<Integer> list = new ArrayList<>();

		if (size == 1) {
			return grid[row][col];
		}

		int min1 = recursion(row, col, grid, size / 2); // 좌상
		int min2 = recursion(row, col + size / 2, grid, size / 2); // 우상
		int min3 = recursion(row + size / 2, col, grid, size / 2); // 좌하
		int min4 = recursion(row + size / 2, col + size / 2, grid, size / 2); // 우하
		
		list.add(min1);
		list.add(min2);
		list.add(min3);
		list.add(min4);
		
		Collections.sort(list);
		return list.get(1);
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine().trim());

		int[][] chair = new int[N][N];

		// 의자에 적힌 추첨번호 적기
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().trim().split(" ");
			for (int j = 0; j < N; j++) {
				chair[i][j] = Integer.parseInt(input[j]);
			}
		}

		int result = recursion(0, 0, chair, N);
		bw.write(String.valueOf(result));

		bw.flush();
		br.close();
		bw.close();

	}
}
