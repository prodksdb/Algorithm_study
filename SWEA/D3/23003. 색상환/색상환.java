import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String [] colors = new String [] {"red", "orange", "yellow", "green", "blue", "purple"};
        int TC = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= TC; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String S = st.nextToken();
            String T = st.nextToken();

            int numA = 0;
            int numB = 0;
            for(int i = 0; i < 6; i++){
                if(colors[i].equals(S)) {
                    numA = i;
                }
                if(colors[i].equals(T)){
                    numB = i;
                }
            }

            if((numA == 5 && numB == 0)|| (numA == 0 && numB == 5)){
                sb.append("A\n");
            }
            else {
                //서로 같은 색일 경우
                if (numA == numB) {
                    sb.append("E\n");
                }//색상환에서 인접한 색이라면?
                else if (Math.abs(numA - numB) == 1) {
                    sb.append("A\n");
                } else if (Math.abs(numA - numB) == 3) {
                    sb.append("C\n");
                } else {
                    sb.append("X\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}