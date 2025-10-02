package 큐.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P26042_식당_입구_대기_줄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 0;
        int lastStudent = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            String st = br.readLine();
            if(st.charAt(0) == '1'){
                String parts[] = st.split(" ");
                int a = Integer.parseInt(parts[1]);
                queue.add(a);
            } else{
                queue.poll();
            }

            if(!queue.isEmpty()){
                int currentsize = queue.size();
                int back = ((LinkedList<Integer>) queue).getLast();

                if(currentsize > maxSize){
                    maxSize = currentsize;
                    lastStudent = back;
                } else if(currentsize == maxSize && back < lastStudent){
                    lastStudent = back;
                }
            }
        }
        System.out.println(maxSize + " " + lastStudent);
    }
}
