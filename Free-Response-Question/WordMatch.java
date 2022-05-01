public class WordMatch {
  private String secret;

  public WordMatch(String word) {
    this.secret = word;
  }

  public int scoreGuess(String guess) {
    return 0;
  }

  public String findBetterGuess(String guess1, String guess2) {
    return null;
  }

  public void main() {
    // Test scoreGuess()
    WordMatch test1 = new WordMatch("Mississippi");
    int test1_val[] = new int[4];
    test1_val[0] = test1.scoreGuess("i");
    test1_val[1] = test1.scoreGuess("iss");
    test1_val[2] = test1.scoreGuess("issipp");
    test1_val[3] = test1.scoreGuess("mississippi");

    System.out.println("Expected scoreGuess('i') = " + 4);
    System.out.println("Actual scoreGuess('i') = " + test1_val[0]);
    System.out.println("Expected scoreGuess('i') = " + 18);
    System.out.println("Actual scoreGuess('i') = " + test1_val[1]);
    System.out.println("Expected scoreGuess('i') = " + 36);
    System.out.println("Actual scoreGuess('i') = " + test1_val[2]);
    System.out.println("Expected scoreGuess('i') = " + 121);
    System.out.println("Actual scoreGuess('i') = " + test1_val[3]);

    // Test findBetterGuess
    WordMatch game = new WordMatch("concatenation");
    String betterScore1 = game.findBetterGuess("ten", "nation");
    System.out.println(betterScore1);
    String betterScore2 = game.findBetterGuess("con","cat");
    System.out.println(betterScore2);
  }
}