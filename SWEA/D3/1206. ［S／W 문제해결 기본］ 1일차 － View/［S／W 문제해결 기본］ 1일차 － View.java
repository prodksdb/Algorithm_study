import java.io.*;
import java.util.*;

public class Solution {
    public static int N;
    public static int [] height;
    public static int maxHeight(int i){
        int max = height[i-2];

        if(max < height[i-1]) max = height[i-1];
        if(max < height[i+1]) max = height[i+1];
        if(max < height[i+2]) max = height[i+2];

        return max;
    }
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            sb.append("#"+test_case+" ");

            N = Integer.parseInt(br.readLine()); // 빌딩의 개수
            height = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++){
                height[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0, max;
            for(int i = 2; i < N-2; i++){
                max = maxHeight(i);
                if( max < height[i]){
                    sum += height[i] - max;
                }
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb.toString());
    }
}