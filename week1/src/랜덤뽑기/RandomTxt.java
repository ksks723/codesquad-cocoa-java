package 랜덤뽑기;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class RandomTxt {
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

    public static Boolean isValidNumber(int n) throws IOException {
        int MIN_MEMBER_COUNT = 0;
        int MAX_MEMBER_COUNT = getTxt().length + 1;
        if (n < MAX_MEMBER_COUNT && n > MIN_MEMBER_COUNT) {
            return true;
        }
        System.out.println("1 ~ "+ --MAX_MEMBER_COUNT  +" 사이의 숫자만 입력해주세요 ");
        return false;
    }

    public static String[] getRandomMember(int n) throws IOException {
        String[] member = getTxt();
        Random rd = new Random();
        String[] pickMem = new String[n];
        for (int i = 0; i < n; i++) {
            pickMem[i] = member[rd.nextInt(14)];
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

    public static String[] getTxt() throws IOException {
        String readTxt = "";
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\ksks7\\IdeaProjects\\codesquad-cocoa-java\\week1\\src\\랜덤뽑기\\name.txt"));
        try {
            StringBuilder builder = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                builder.append(line);
                line = br.readLine();
            }
            readTxt = builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        return readTxt.split(",");
    }

}
