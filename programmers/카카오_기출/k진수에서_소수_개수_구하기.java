package 카카오_기출;

public class k진수에서_소수_개수_구하기 {
    public int solution(int n, int k) {
        String converted = Integer.toString(n, k);
        String[] parts = converted.split("0");
        int count = 0;

        for(String part : parts){
            if(part.isEmpty()) continue;
            long num = Long.parseLong(part);
            if(isPrime(num)) count++;
        }

        return count;
    }
    private boolean isPrime(long num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(num);
        for(int i=3; i<=sqrt; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
