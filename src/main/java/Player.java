public class Player {

    private String name;
    private int score;

    private Move currentMove = null;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Move getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(Move currentMove) {
        this.currentMove = currentMove;
    }

    public void incrementScore() {
        this.score++;
    }
}
