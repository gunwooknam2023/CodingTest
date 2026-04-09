package 수학1.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193_분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int line = 1;
        int countSum = 0;

        while (true) {
            if (x <= countSum + line) {
                int pos = x - countSum;

                if (line % 2 == 0) {
                    System.out.println(pos + "/" + (line - pos + 1));
                } else {
                    System.out.println((line - pos + 1) + "/" + pos);
                }
                break;
            }

            countSum += line;
            line++;
        }
    }
}
