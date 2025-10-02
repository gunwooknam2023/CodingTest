package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P10448_유레카_이론 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[T];

        for(int i=0; i<T; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        List<Integer> list = new ArrayList<>();
        for(int i=1; ; i++){
            int t = i * (i+1) / 2;
            if(t > 1000) break;
            list.add(t);
        }

        for(int num : arr){
            boolean found = false;
            for(int i=0; i<list.size()-2; i++){
                for(int j=i; j<list.size()-1; j++){
                    for(int k=j; k<list.size(); k++){
                        if(list.get(i) + list.get(j) + list.get(k) == num){
                            found = true;
                            break;
                        }
                    }
                    if(found) break;
                }
                if(found) break;
            }
            System.out.println(found ? 1 : 0);
        }
    }
}
