package 인디언이름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] userBirth = getBirth().split(" ");
        int[] userBirthInt = birthManufacture(userBirth);
        NameFactory nf = makeIndiansName(userBirthInt);
        printName(nf);
    }

    public static String getBirth() throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("생년월일을 입력해 주세요 ex)1999 07 23");
        String userBirth = re.readLine();
        while (!isValidBirth(userBirth)) {
            return getBirth();
        }
        return userBirth;
    }

    public static Boolean isValidBirth(String userBirth) {
        String pattern = "^(19[0-9][0-9]|20\\d{2})\\s(0[0-9]|1[0-2])\\s(0[1-9]|[1-2][0-9]|3[0-1])$";
        return Pattern.matches(pattern, userBirth);
    }

    public static int[] birthManufacture(String[] userBirth) {
        int year = userBirth[0].charAt(3) - '0';
        int month = Integer.parseInt(userBirth[1]);
        int day = Integer.parseInt(userBirth[2]);
        int[] userBirthInt = new int[]{year, month, day};
        return userBirthInt;
    }

    public static NameFactory makeIndiansName(int[] userBirth) {
        NameFactory nf = new NameFactory(userBirth[0],userBirth[1],userBirth[2]);
        return nf;
    }

    public static void printName(NameFactory nf) {
        System.out.println(nf);
    }


}
