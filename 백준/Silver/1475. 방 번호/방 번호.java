import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int [] count = new int[10];

        for(char c : N.toCharArray()){
            count[c-'0']++;
        }

        count[6] = (count[6]+count[9]+1) / 2;
        count[9] = 0;

        int result = 0;
        for(int i = 0; i < 9; i++){
            result = Math.max(result, count[i]);
        }

        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }
}