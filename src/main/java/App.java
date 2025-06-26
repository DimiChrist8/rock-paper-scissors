public class App {

    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 0);
        Player player2 = new Player("Player 2", 0);
        int rounds = 100;

        player1.setCurrentMove(Move.PAPER);

        for (int i = 0; i < rounds; i++) {
            player2.setCurrentMove(Move.randomMove());

            int result = player1.getCurrentMove().compare(player2.getCurrentMove());

            switch (result) {
                case 1 -> player1.incrementScore();
                case -1 -> player2.incrementScore();
            }
        }

        System.out.printf("Player A wins %d of %d games%n", player1.getScore(), rounds);
        System.out.printf("Player B wins %d of %d games%n", player2.getScore(), rounds);
        System.out.printf("Tie: %d of %d games%n", rounds - (player1.getScore() + player2.getScore()), rounds);

    }

}
