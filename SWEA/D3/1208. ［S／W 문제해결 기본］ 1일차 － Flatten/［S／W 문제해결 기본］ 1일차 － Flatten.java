import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for( int test_case = 1; test_case <= 10; test_case++){
            sb.append("#"+test_case+" ");

            // 1. 덤프 횟수
            int dumpCount = Integer.parseInt(br.readLine());

            // 2. 상자 위치 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int [] box = new int[101];
            for(int i = 1; i <= 100; i++){
                box[i] = Integer.parseInt(st.nextToken());
            }

            //3. 평탄화 과정을 위해 높이를 오름차순으로 정렬
            Arrays.sort(box);

            //4. 평탄화하기
            while(dumpCount != 0 ){

                if(box[0] == box[100]){
                    break;
                }

                box[1] = box[1] + 1;
                box[100] = box[100] - 1;
                Arrays.sort(box);
                dumpCount--;
            }

            int result = box[100] - box[1];
            sb.append(result+"\n");
        }
        System.out.println(sb.toString());
    }
}