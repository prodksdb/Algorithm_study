import java.io.*;
import java.nio.BufferOverflowException;
import java.util.*;

public class Solution {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int test_case = 1; test_case <= 10; test_case++ ) {
            sb.append("#" + test_case + " ");
            int N = Integer.parseInt(br.readLine());
            String string = br.readLine();

            int answer = 0; // 유효성 판단 0 or 1
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < N; i++) {
                char bracket = string.charAt(i);
                // 열린 괄호면 stack에 넣기
                if(bracket == '(' || bracket == '[' || bracket == '{' || bracket == '<'){
                    stack.push(bracket);
                } // 닫힌 괄호면 스택에서 꺼내서 괄호 종류를 비교
                else if(bracket == ')' || bracket == ']' || bracket == '}' || bracket == '>'){
                    if(!stack.isEmpty()){
                        char pop = stack.pop();
                        if(pop == '(' && bracket == ')'){
                            answer = 1;
                        }else if(pop == '{' && bracket == '}'){
                            answer = 1;
                        }else if(pop == '[' && bracket == ']'){
                            answer = 1;
                        }else if(pop == '<' && bracket == '>'){
                            answer = 1;
                        }else{
                            answer = 0;
                            break;
                        }
                    }
                    else  // 닫힌 괄호를 만났는데 짝이 없을 경우
                    {
                        answer = 0;
                        break;
                    }
                }
            }

            // 스택에 괄호가 남아있다면?
            if(!stack.isEmpty()){
                answer = 0;
            }

            sb.append(answer);
            sb.append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
}