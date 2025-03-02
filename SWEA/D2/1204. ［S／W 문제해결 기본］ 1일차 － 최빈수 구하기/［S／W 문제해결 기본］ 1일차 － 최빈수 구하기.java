import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1 ; test_case <= T; test_case++){
            int t = Integer.parseInt(br.readLine());
            sb.append("#"+t+" ");

            int [] count = new int[101];
            int max = Integer.MIN_VALUE;
            int maxScore = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                count[score]++;

                if (count[score] > max) {
                    max = count[score];
                    maxScore = score;
                } else if (count[score] == max) {
                    if (score > maxScore) maxScore = score;
                }
            }

            sb.append(maxScore+"\n");
        }

        System.out.println(sb.toString());
    }

}