// Strategy
// for each headline, loop through each character and save its frequency to a map
// then (after skipping spaces) calculate the frequency they occur in each message by incrementing a map
import java.util.HashMap;
import java.util.ArrayList;
public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        ArrayList<String> headSentences = new ArrayList<String>();
        for (int i = 0; i < headlines.length; i++) {
            HashMap<Character, Integer> headWords = new HashMap<Character, Integer>();
            for (int j = 0; j < headlines[i].length(); j++) {
                if (headWords.containsKey(' ')) {
                    headWords.put(headlines[i].charAt(j), 1);
                }
                else {
                    headWords.put(headlines[i].charAt(j), headWords.get(headlines[i]) + 1);
                }
            }
        }
        return 0;
    }
}