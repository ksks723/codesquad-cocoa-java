package 조건문;

import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args){
        //1330번
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if(A>B) System.out.println(">");
        if(A<B) System.out.println("<");
        if(A==B) System.out.println("==");
    }
}
