import java.util.HashSet;
import java.util.ArrayList;
public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        ArrayList<String> playerNoDups = new ArrayList<>();
        for (String word : player) {
            if(!playerNoDups.contains(word)) {
                playerNoDups.add(word);
            }
        }
        int score = 0;
        HashSet<String> dictionarySet = new HashSet<String>();
        for (int i = 0; i < dictionary.length; i++) {
            dictionarySet.add(dictionary[i]);
        }
        for (int i = 0; i < playerNoDups.size(); i++) {
            if (dictionarySet.contains(playerNoDups.get(i))) {
                score += playerNoDups.get(i).length() * playerNoDups.get(i).length();
            }
        }
        return score;
    }
}