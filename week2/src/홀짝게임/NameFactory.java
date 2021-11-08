package 홀짝게임;

public class NameFactory {

    private int year;


    @Override
    public String toString() {
        return "당신의 이름은 " + getYearName() ;
    }

    public NameFactory(int year, int month, int day) {
        this.year = year;

    }

    public String getYearName() {
        String[] name = {"시끄러운", "푸른", "어두운", "조용한", "웅크린", "백색",
                "지혜로운", "용감한", "날카로운", "욕심많은"};

        return name[year];
    }

}
