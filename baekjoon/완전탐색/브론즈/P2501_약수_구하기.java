package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2501_약수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=N; i++){
            if(N % i == 0){
                list.add(i);
            }
        }

        if(list.size() >= K){
            System.out.println(list.get(K-1));
        } else{
            System.out.println("0");
        }
    }
}
