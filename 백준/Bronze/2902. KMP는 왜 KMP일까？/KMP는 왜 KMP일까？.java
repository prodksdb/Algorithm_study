import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String [] S = br.readLine().trim().split("-");
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < S.length; i++){
      sb.append(S[i].charAt(0));
    }

    bw.write(sb+"");

    bw.flush();
    br.close();
    bw.close();
    }

  }