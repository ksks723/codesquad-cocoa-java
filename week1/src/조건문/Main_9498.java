package 조건문;

import java.util.Scanner;

public class Main_9498 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        if(90 <= A && 100>= A) System.out.println("A");
        if(80 <= A && 89>= A) System.out.println("B");
        if(70 <= A && 79>= A) System.out.println("C");
        if(60 <= A && 69>= A) System.out.println("D");
        if(59 >= A) System.out.println("F");

    }
}
