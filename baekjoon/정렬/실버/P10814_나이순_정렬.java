package 정렬.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10814_나이순_정렬 {
    static class Member {
        int age;
        String name;
        Member(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Member arr[] = new Member[N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new Member(age, name);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a.age, b.age));

        StringBuilder sb = new StringBuilder();
        for(Member m : arr){
            sb.append(m.age).append(' ').append(m.name).append('\n');
        }

        System.out.println(sb);
    }
}
