import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, 수열에 포함되는 수, x 입력 받기
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(number);

        // 조건을 만족하는 쌍의 개수 찾기
        int l = 0, r = n-1;
        int count = 0;
        while( l < r){  //O(n)
            int sum = number[l] + number[r];
            if(sum == x){
                count++;
                l++; r--; //정답을 찾았으므로 포인터 이동
            }else if( sum < x){
                l++;  // 합이 부족하므로 왼쪽 포인터 증가
            }else{
                r--;  //합이 크므로 오른쪽 포인터 감소
            }
        }

        System.out.println(count);
    }
}