import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= TC; test_case++){
            sb.append("#"+test_case+" ");
            int K = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < K; i++){
                int a = Integer.parseInt(br.readLine());
                if( a == 0){
                    stack.pop();
                }else {
                    stack.add(a);
                }
            }
            int sum = 0;
            while(!stack.isEmpty()){
                sum += stack.pop();
            }
            sb.append(sum+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}