package 랜덤뽑기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomPick {
    public static void main(String[] args) throws IOException {
        int answer = takeMemberCount();
        while (!isValidNumber(answer)) {
            answer = takeMemberCount();
        }
        String[] pickMem = getRandomMember(answer);
        printMember(pickMem);
    }

    public static int takeMemberCount() throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("몇 명인가요? :");
        int answer = Integer.parseInt(re.readLine());
        return answer;
    }

    public static Boolean isValidNumber(int n) {
        int MIN_MEMBER_COUNT = 0;
        int MAX_MEMBER_COUNT = 11;
        if (n < MAX_MEMBER_COUNT && n > MIN_MEMBER_COUNT) {
            return true;
        }
        System.out.println("1~10 사이의 숫자만 입력해주세요 ");
        return false;
    }

    public static String[] getRandomMember(int n) {
        String[] member = {"검봉", "Hanse", "Yan", "Ella", "Konda", "sonny", "반스", "Teemo", "Bart", "Jarry"};
        Random rd = new Random();
        String[] pickMem = new String[n];
        for (int i = 0; i < n; i++) {
            pickMem[i] = member[rd.nextInt(10)];
            for (int j = 0; j < i; j++) {
                if (pickMem[i].equals(pickMem[j])) {
                    i--;
                }
            }
        }
        return pickMem;
    }

    public static void printMember(String[] pickMem) {
        for (int i = 0; i < pickMem.length; i++) {
            System.out.print(pickMem[i]);
            if (i != pickMem.length - 1) {
                System.out.print(", ");
            }
        }
    }

}
