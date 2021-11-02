package 별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(reader.readLine());
        //readLine()의 리턴값은 String 고정이라서 형변환을 해줘야 한다.
        //입력값으로 들어온 데이터를 한줄로 읽어서 String으로 바꿔줌, 무조건 한줄만 읽는다.
        //readLine()할때마다 try&catch를 해줘도 되지만 대게 throws IOException을 해준다.

        for (int i=0; i<row; i++) {
            for (int j=1; j<row-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=row-1; i>0; i--) {
            for (int j=row-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j=i*2-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
