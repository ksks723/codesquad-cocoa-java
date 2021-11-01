package 반복문;

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        char[] inputArr = b.toCharArray();
        int sum = 0;
        for(int i=0; i<a; i++){
            sum += inputArr[i] - '0';
        }
        System.out.println(sum);
    }
}
