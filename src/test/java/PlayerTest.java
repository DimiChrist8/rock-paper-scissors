import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void incrementScore() {
        Player player = new Player("Player1", 0);

        player.incrementScore();
        assertEquals(player.getScore(), 1);

        player.incrementScore();
        player.incrementScore();
        assertEquals(player.getScore(), 3);
    }
}