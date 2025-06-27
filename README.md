Short description of advantages and disadvantages.

Advantages
  
  -Separation of concerns:
    1) Move enum encapsulates all move-related logic (values, random selection, comparison).
    2) Player holds state (name, score, current move) and simple behavior (incrementScore()).

  -Testability:
    Focused unit tests for Move.compare() and Player.incrementScore() verify core behavior in isolation.

  -Simplicity and readability:
    The flow of App.main() is straightforward: set up players, loop, compare, count, report.


Disadvantages

  -Lack of extensibility/flexibility:
    Game logic lives entirely in App.main(). Hard to swap in different player strategies without editing the loop.

  -Hard-coded parameters:
    Number of rounds (100) and Player A’s fixed move (PAPER) are taken into account istead of being configurable.
