import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveTest {

    @Test
    void compareRockScissors() {
        assertEquals(1, Move.ROCK.compare(Move.SCISSORS));
        assertEquals(-1, Move.SCISSORS.compare(Move.ROCK));
    }

    @Test
    void comparePaperRock() {
        assertEquals(1, Move.PAPER.compare(Move.ROCK));
        assertEquals(-1, Move.ROCK.compare(Move.PAPER));
    }

    @Test
    void compareScissorsPaper() {
        assertEquals(1, Move.SCISSORS.compare(Move.PAPER));
        assertEquals(-1, Move.PAPER.compare(Move.SCISSORS));
    }

    @Test
    void compareSameMove() {
        assertEquals(0, Move.SCISSORS.compare(Move.SCISSORS));
        assertEquals(0, Move.PAPER.compare(Move.PAPER));
        assertEquals(0, Move.ROCK.compare(Move.ROCK));

    }

}