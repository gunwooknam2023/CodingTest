package 완전탐색.실버;

public class P4673_셀프_넘버 {
    public static void main(String[] args) {
        boolean visited[] = new boolean[10001];

        for(int i=1; i<=10000; i++){
            int n = d(i);
            if(n <= 10000){
                visited[n] = true;
            }
        }

        for(int i=1; i<=10000; i++){
            if(!visited[i]){
                System.out.println(i);
            }
        }
    }
    private static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
