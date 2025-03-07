import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int test_case = 1; test_case <=TC; test_case++){
            int N = Integer.parseInt(br.readLine());
            sb.append("#"+test_case+" ");
            String correct = br.readLine();
            String answer = br.readLine();

            int count = 0;
            for(int i = 0; i < correct.length(); i++){
                if(correct.charAt(i) == answer.charAt(i)){
                    count++;
                }
            }

            sb.append(count+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}