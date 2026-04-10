package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P11478_서로_다른_부분_문자열의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> hs = new HashSet<>();
        String str = br.readLine();

        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                hs.add(str.substring(i, j));
            }
        }

        System.out.println(hs.size());
    }
}
