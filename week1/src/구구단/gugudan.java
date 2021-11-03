package 구구단;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int start = 0;
        int end = 0;
        boolean ck = true;
        while(ck) {
            System.out.println("시작단을 입력하세요 ex: 2");
            start = sc.nextInt();
            System.out.println("끝단을 입력하세요 ex: 9");
            end = sc.nextInt();
            if(start>0 && end>start) ck = false;
        }

        for(int i = start; i<= end; i++){
            for(int j = 1; j<10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
