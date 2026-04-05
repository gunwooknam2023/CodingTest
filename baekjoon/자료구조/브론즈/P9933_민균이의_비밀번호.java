package 자료구조.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P9933_민균이의_비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        String password = "";

        for (int i=0; i<n; i++) {
            String word = br.readLine();
            set.add(word);

            String reversedWord = new StringBuilder(word).reverse().toString();

            if (set.contains(reversedWord)) {
                password = reversedWord;
            }
        }

        if (!password.equals("")) {
            int len = password.length();
            char middle = password.charAt(password.length() / 2);

            System.out.println(len + " " + middle);
        }
    }
}
