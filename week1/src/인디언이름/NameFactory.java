package 인디언이름;

public class NameFactory {

    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "당신의 이름은 " + getYearName() + " " + getMonthName() + getDayName() + "입니다.";
    }

    public NameFactory(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYearName() {
        String[] name = {"시끄러운", "푸른", "어두운", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};

        return name[year];
    }

    public String getMonthName() {
        String[] name = {"늑대", "태양", "양", "매", "황소", "불꽃",
                "나무", "달빛", "말", "돼지", "하늘", "바람"};

        return name[year];
    }

    public String getDayName() {
        String[] name = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에", "", "", "", "의 환생", "의 죽음", "아래에서",
                "을(를) 보라", "이(가) 노래하다.", "의 그늘 → 그림자", "의 일격", "에게 쫒기는 남자", "의 행진", "의 왕", "의 유령",
                "을 죽인 자.", "은(는) 맨날 잠잔다.", "처럼..", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래",
                "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "의 심판자→을(를) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다."};

        return name[year];
    }
}
