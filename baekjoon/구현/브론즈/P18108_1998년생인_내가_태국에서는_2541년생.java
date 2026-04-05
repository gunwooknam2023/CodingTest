package 구현.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18108_1998년생인_내가_태국에서는_2541년생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        System.out.println(year-543);
    }
}
