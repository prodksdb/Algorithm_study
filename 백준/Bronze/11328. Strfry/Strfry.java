import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String input1 = st.nextToken();
            String input2 = st.nextToken();


            int [] alphabet1 = new int[27];
            int [] alphabet2 = new int[27];

            int length = input1.length();
            for(int j = 0; j < length; j++){
                alphabet1[input1.charAt(j)-'a']++;
            }

            length = input2.length();
            for(int j = 0; j < length; j++){
                alphabet2[input2.charAt(j)-'a']++;
            }

            int check = 0;
            for(int j = 0; j <26; j++){
                if(alphabet1[j] != alphabet2[j]){
                   check++;
                   break;
                }
            }

            if(check > 0){
                sb.append("Impossible\n");
            }else{
                sb.append("Possible\n");
            }
        }
        System.out.println(sb);
    }
}