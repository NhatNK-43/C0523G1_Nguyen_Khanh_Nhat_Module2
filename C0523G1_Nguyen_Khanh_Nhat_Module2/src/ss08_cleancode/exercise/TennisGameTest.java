package ss08_cleancode.exercise;

public class TennisGameTest {
    public static void main(String[] args) {
        TennisGame tennisGame1 = new TennisGame("Nam","Nhat",0,3);
        System.out.println(tennisGame1);

        TennisGame tennisGame2 = new TennisGame("Nam","Nhat",3,3);
        System.out.println(tennisGame2);

        TennisGame tennisGame3 = new TennisGame("Nam","Nhat",4,3);
        System.out.println(tennisGame3);
    }
}
