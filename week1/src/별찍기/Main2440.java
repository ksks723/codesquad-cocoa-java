package 별찍기;

import java.util.Scanner;

public class Main2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i= 0; i<a; i++){
            for(int j = a-i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
