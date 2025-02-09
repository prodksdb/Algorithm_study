import java.util.Scanner;

public class Main {

	static String S;
	static int count = 0;
	
	public static int isPalindrome(String S) {
		count = 0;
		return recursion(S, 0, S.length() -1);
	}
	
	public static int recursion(String s, int l, int r) {
		count++;
		if (l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else {
			return recursion(s, l+1, r-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			S = sc.next();
			int result = isPalindrome(S);
			System.out.println(result+" "+count);
			
		}
		sc.close();
	}
}
