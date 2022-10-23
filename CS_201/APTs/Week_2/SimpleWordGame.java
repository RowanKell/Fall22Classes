import java.util.HashSet;
public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        int score = 0;
        HashSet dictionarySet = new HashSet();
        for (int i = 0; i < dictionary.length; i++) {
            dictionarySet.add(dictionary[i]);
        }
        for (int i = 0; i < player.length; i++) {
            if (dictionarySet.contains(player[i])) {
                score += player[i].length() * player[i].length();
            }
        }
        return score;
    }
}