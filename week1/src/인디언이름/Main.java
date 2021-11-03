package 인디언이름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       String[] birth = getBirth();

    }

    public static String[] getBirth() throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("생년월일을 입력해 주세요 ex)1999 07 23");
        String[] birth = re.readLine().split(" ");
        return birth;
    }
}
