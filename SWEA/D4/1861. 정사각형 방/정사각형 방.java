import java.io.*;
import java.util.*;

public class Solution {
    private static int N;
    private static int [] dx = {-1, 1, 0, 0};
    private static int [] dy = {0, 0, -1, 1};
    private static int [][] rooms;
    private static boolean [][] visited;
    private static int max;
    private static StringBuilder sb = new StringBuilder();
    private static int roomNumber;

    private static int dfs(int curX, int curY, int count ){
        visited[curX][curY] = true;
        int maxDepth = count;

        for(int i = 0; i < 4; i++){
            int nx = curX + dx[i];
            int ny = curY + dy[i];
            if(can_go(nx, ny)){
                if(rooms[curX][curY] + 1== rooms[nx][ny] && !visited[nx][ny]){
                    maxDepth= Math.max(maxDepth, dfs(nx, ny, count+1));
                }
            }
        }
        visited[curX][curY] = false;
        return maxDepth;
    }

    private static boolean can_go(int nx, int ny){
        return nx >= 0 && ny >= 0 && nx < N && ny < N ;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            sb.append("#"+test_case+" ");
            N = Integer.parseInt(br.readLine());

            rooms = new int[N][N];
            for(int i = 0; i< N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < N; j++){
                    rooms[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            max = -1;
            roomNumber = Integer.MAX_VALUE;


            for(int i = 0; i < N; i++){
                for(int j= 0; j < N; j++){
                    visited = new boolean[N][N];
                    int count = dfs(i, j, 1);

                    if(count > max){
                        max = count;
                        roomNumber = rooms[i][j];
                    }else if(count == max && rooms[i][j] < roomNumber){
                        roomNumber = rooms[i][j];
                    }
                }
            }
            sb.append(roomNumber +" "+max);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}