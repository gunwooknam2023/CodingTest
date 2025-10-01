package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            Stack<Character> stack = new Stack<>();
            String st = br.readLine();
            boolean vaild = true;

            for(int j=0; j<st.length(); j++) {
                char ch = st.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        vaild = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(vaild && stack.isEmpty()){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
