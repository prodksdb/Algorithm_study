import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String one = br.readLine();
        String two = br.readLine();

        int [] alphabet1 = new int[26];
        int [] alphabet2 = new int[26];
        for( char c : one.toCharArray()){
            alphabet1[c-'a']++;
        }

        for(char c: two.toCharArray()){
            alphabet2[c-'a']++;
        }

        int count = 0;
        for(int i =  0; i < 26; i++){
            if(alphabet1[i] != alphabet2[i]){
                count += Math.abs(alphabet2[i]-alphabet1[i]);
            }
        }

        System.out.println(count);
    }
}