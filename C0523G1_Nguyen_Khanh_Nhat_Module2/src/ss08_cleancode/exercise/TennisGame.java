package ss08_cleancode.exercise;

public class TennisGame {
    private String namePlayer1;
    private String namePlayer2;
    private int scorePlayer1;
    private int scorePlayer2;

    public TennisGame() {
    }
    public TennisGame(String namePlayer1, String namePlayer2, int scorePlayer1, int scorePlayer2) {
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
        this.scorePlayer1 = scorePlayer1;
        this.scorePlayer2 = scorePlayer2;
    }
    public String toString() {
        String result = "Player1: "+namePlayer1+" - Player2: "+namePlayer2;
        if (scorePlayer1 == scorePlayer2) {
            if (scorePlayer1 >= 4) {
                result += "Deuce";
            } else {
                result += howToCallScore(scorePlayer1) + " - All";
            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int differenceScore = scorePlayer1 - scorePlayer2;
            if (differenceScore == 1) {
                result += namePlayer1+ " advantage";
            } else if (differenceScore == -1) {
                result += namePlayer2+ " advantage";
            } else if (differenceScore >= 2) {
                result += namePlayer1+ " win";
            } else {
                result += namePlayer2+ " win";
            }
        } else {
            result += howToCallScore(scorePlayer1) + " - " + howToCallScore(scorePlayer2);
        }
        return result;
    }

    public String howToCallScore(int score) {
        String result = "";
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
                break;
        }
        return result;
    }
}
