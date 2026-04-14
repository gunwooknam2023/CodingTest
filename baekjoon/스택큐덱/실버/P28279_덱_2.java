package 스택큐덱.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P28279_덱_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    queue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append("\n");
                    break;
                case 4:
                    sb.append(queue.isEmpty() ? -1 : queue.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(queue.size()).append("\n");
                    break;
                case 6:
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    break;
                case 8:
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
