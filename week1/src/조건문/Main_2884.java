package 조건문;

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        if(m<45){
            m = m+60-45;
            if(h==0) h =23;
            else h -= 1;
        }else{
            m -= 45;
        }
        System.out.println(h+" "+m);
    }
}
