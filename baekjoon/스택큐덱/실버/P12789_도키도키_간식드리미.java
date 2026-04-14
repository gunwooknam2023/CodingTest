package 스택큐덱.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12789_도키도키_간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] line = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int now = 1;

        for (int i=0; i<n; i++) {
            if (line[i] != now) {
                stack.push(line[i]);
            } else {
                now++;
            }

            while (!stack.isEmpty() && stack.peek() == now) {
                stack.pop();
                now++;
            }
        }

        if (now == n+1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
