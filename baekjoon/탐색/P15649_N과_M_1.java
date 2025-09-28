package 탐색;

import java.util.Scanner;

public class P15649_N과_M_1 {
    static int N, M;
    static boolean[] V;
    static int[] S;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N  = sc.nextInt();
        M = sc.nextInt();
        S = new int[N];
        V = new boolean[N];
        backtraking(0);
    }

    private static void backtraking(int length) {
        if(length == M){
            printArray();
            return;
        }
        for(int i=0; i<N; i++){
            if(!V[i]){
                V[i] = true;
                S[length] = i;
                backtraking(length+1);
                V[i] = false;
            }
        }
    }

    private static void printArray() {
        for(int i=0; i<M; i++){
            System.out.print(S[i] + 1 + " ");
        }
    }
}
