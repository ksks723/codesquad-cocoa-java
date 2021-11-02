package 조건문;

import java.util.Scanner;

public class Main2753 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        String ck = "0";

        if(A%4==0 && (A%100 !=0 || A%400 == 0)) ck = "1";
        System.out.println(ck);
    }
}
