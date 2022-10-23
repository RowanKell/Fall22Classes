import java.util.ArrayList;
import java.util.Collections;

public class BigWord {
    public String most(String[] sentences) {
        ArrayList<String> separatedWords = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            String[] tempArray = sentences[i].split(" ");
            for (int k = 0; k < tempArray.length; k++) {
                separatedWords.add(tempArray[k].toLowerCase());
            }
        }
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < separatedWords.size(); i++) {
            if(Collections.frequency(separatedWords, separatedWords.get(i)) > max) {
                max = Collections.frequency(separatedWords, separatedWords.get(i));
                maxIndex = i;
            }
        }
        return separatedWords.get(maxIndex).toLowerCase();
    }
}
