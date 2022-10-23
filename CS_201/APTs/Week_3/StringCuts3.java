import java.util.Arrays;
import java.util.HashSet;
public class StringCuts3 {
    public String[] filter(String[] list, int minLength) {
        HashSet<String> outputSet = new HashSet<>(Arrays.asList(list));
        String outputArray [] = new String[outputSet.size()];
        int i = 0;
        for (String word : outputSet) {
            if(word.length() >= minLength) {
                outputArray[i] = word;
                i++;
            }
        }
        return outputArray;
    }
}