import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] numbers = new int [N];
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < N; i++){
            if(numbers[i] == v){
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }
}