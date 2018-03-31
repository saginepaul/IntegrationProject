// while loop example 
// serching an array example from language companion program 8-3
public class Arrays {
  private int[] GameScores = { 65, 78, 83, 96, 99 };

  public int[] getGameScores() {
    return GameScores;
  }

  public void setGameScores(int[] gameScores) {
    GameScores = gameScores;
  }

  public boolean isFound() {
    return found;
  }

  public void setFound(boolean found) {
    this.found = found;
  }

  private boolean found;

  public void GameStatistics() {

    int index;
    index = 0;
    found = false;
    while (found == false && index < GameScores.length) {
      if (GameScores[index] == 100)
        found = true;
      else
        index = index + 1;
    }
    if (found)
      System.out.println("You scored 100 points on game # " + index);
    else
      System.out.println(" You did not scored 100 points on any game");
  }
}
