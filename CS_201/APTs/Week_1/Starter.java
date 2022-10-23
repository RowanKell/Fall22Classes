import java.util.ArrayList;
public class Starter {
    public int begins(String[] words, String first) {
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for(int i = 0; i < words.length; i++) {
            if(uniqueWords.contains(words[i])){
                continue;
            }
            else{
                uniqueWords.add(words[i]);
            }
        }
        int uniqueCount = 0;
        for(int i = 0; i < uniqueWords.size(); i++) {
            if(uniqueWords.get(i).substring(0, 1).equals(first)) {
                uniqueCount += 1;
            }
        }
        return uniqueCount;
    }
}