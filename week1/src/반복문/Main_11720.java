package 반복문;

import java.util.Scanner;

public class Main_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
                            //9번 코드에서 입력한 값 + \n 에서
                            //nextInt()가  입력한 값만 떼어가고 \n 만 남게되는데
                            //next()는 개행문자(\n)를 무시하고 입력을 받고, 
                            //nextLine()은 한줄 단위로 입력을 받기 때문에 개행문자도 포함한다
        char[] inputArr = b.toCharArray();
        int sum = 0;
        for(int i=0; i<a; i++){
            sum += inputArr[i] - '0';
        }
        System.out.println(sum);
    }
}
