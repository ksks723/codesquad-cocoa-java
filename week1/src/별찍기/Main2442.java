package 별찍기;

import java.util.Scanner;

public class Main2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i= 1; i<=a; i++){
            for(int j=a; j>i; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
