package 인디언이름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(getBirth());

    }

    public static String getBirth() throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        String pattern = "^(19[0-9][0-9]|20\\d{2})\\s(0[0-9]|1[0-2])\\s(0[1-9]|[1-2][0-9]|3[0-1])$";
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


    public static String getYearName(int n) {
        String[] name = {"시끄러운", "푸른", "어두운", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};

        return "";
    }

    public static String getMonthName(int n) {
        String[] name = {"늑대", "태양", "양", "매", "황소", "불꽃",
                "나무", "달빛", "말", "돼지", "하늘", "바람"};

        return "";
    }

    public static String getDayName(int n) {
        String[] name = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에", "", "", "", "의 환생", "의 죽음", "아래에서",
                "을(를) 보라", "이(가) 노래하다.", "의 그늘 → 그림자", "의 일격", "에게 쫒기는 남자", "의 행진", "의 왕", "의 유령",
                "을 죽인 자.", "은(는) 맨날 잠잔다.", "처럼..", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래",
                "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "의 심판자→을(를) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다."};

        return "";
    }
}
