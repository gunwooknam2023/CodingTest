package trail0.ch1;

public class P_변수_값_복사하기_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 3;

        a = c;
        a += c;
        b -= c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
