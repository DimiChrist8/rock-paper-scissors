import java.util.Random;

public enum Move {
    ROCK, PAPER, SCISSORS;


    private static final Move[] VALUES = values();
    private static final Random RANDOM = new Random();

    public static Move randomMove() {
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }

    public int compare(Move other) {
        if (this == other) return 0;
        return switch (this) {
            case ROCK     -> (other == SCISSORS) ? 1 : -1;
            case PAPER    -> (other == ROCK)     ? 1 : -1;
            case SCISSORS -> (other == PAPER)    ? 1 : -1;
        };
    }
}
