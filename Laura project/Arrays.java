// while loop example 
// serching an array example from language companion program 8-3
public class Arrays {
  private int[] gameScores = { 65, 78, 83, 96, 99 };

  public int[] getGameScores() {
    return gameScores;
  }

  public boolean isFound() {
    return found;
  }

  public void setFound(boolean found) {
    this.found = found;
  }

  private boolean found;

  /**Returns game scores.
   *@author laurapaul
   */
  public void gameStatistics() {

    int index;
    index = 0;
    found = false;
    while (found == false && index < gameScores.length) {
      if 
      (gameScores[index] == 100) {
        found = true;
      } else {
        index = index + 1;
      }
      if (found) {
        System.out.println("You scored 100 points on game # " + index);
      } else {
        System.out.println(" You did not scored 100 points on any game");
      }
    }
  }
}

