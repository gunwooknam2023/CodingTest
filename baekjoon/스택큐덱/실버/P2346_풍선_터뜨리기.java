package 스택큐덱.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346_풍선_터뜨리기 {
    static class Ballon {
        int index;
        int value;

        Ballon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Ballon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=1; i<=n; i++) {
            deque.add(new Ballon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        Ballon current = deque.pollFirst();
        sb.append(current.index).append(" ");

        while (!deque.isEmpty()) {
            int move = current.value;

            if (move > 0) {
                for (int i=0; i<move-1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                current = deque.pollFirst();
            } else {
                for (int i=0; i<Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
                current = deque.pollFirst();
            }
            sb.append(current.index).append(" ");
        }

        System.out.println(sb);
    }
}
