import java.util.Scanner;

public class Main {

	static int N, M;
	static int [] combination;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		combination = new int[M];
		
		dfs(1,0);
		sc.close();
	}
	
	public static void dfs(int start, int depth) {
	if(depth == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(combination[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i <= N; i ++) {
			combination[depth] = i; //현재 숫자 선
			dfs(i+1, depth+1); // 다음 숫자 선
		}
	}
}
