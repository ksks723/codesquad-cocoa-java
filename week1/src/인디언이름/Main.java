package 인디언이름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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
        String[] name = {"~와(과) 함께 춤을", "~의 기상", "~은(는) 그림자 속에", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};

        return "";
    }
}
