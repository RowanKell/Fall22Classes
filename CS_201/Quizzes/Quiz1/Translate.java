//Make hashMap where the keys are the different original words, and the values are hashsets with each translated word that corresponds to its key
//Check each value to see if the size of the hashset > 1, if so add it to a running count
import java.util.*;
public class Translate {
    public int numAlternates(String original, String translated) {
        String[] oArray = original.split(" ");
        String[] tArray = translated.split(" ");
        HashMap<String, HashSet<String>> myMap = new HashMap<>();
        //loop over original AND translated at same time
        for(int i = 0; i < oArray.length; i++) {
            if(myMap.containsKey(oArray[i])) {
                HashSet<String> set = myMap.get(oArray[i]);
                set.add(tArray[i]);
            }
            else {
                HashSet<String> newSet = new HashSet<>();
                newSet.add(tArray[i]);
                myMap.put(oArray[i],newSet);
            }
        }
        int sum = 0;
        for(HashSet<String> set : myMap.values()) {
            if(set.size() > 1) {
                sum += set.size();
            }
        }
        return sum;
    }
}
