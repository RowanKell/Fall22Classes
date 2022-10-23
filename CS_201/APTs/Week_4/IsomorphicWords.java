import java.util.HashMap;
import java.util.ArrayList;
public class IsomorphicWords {
    public boolean compareMaps(HashMap<Character, ArrayList<Integer>> map1, HashMap<Character, ArrayList<Integer>> map2) {
        for (ArrayList<Integer> list1 : map1.values()) {
            if(!map2.containsValue(list1)) {
                return false;
            }
        }
        for (ArrayList<Integer> list2 : map2.values()) {
            if(!map1.containsValue(list2)) {
                return false;
            }
        }
        return true;
    }
    public int countPairs(String[] words) {
        //Create List for storing maps
        ArrayList<HashMap<Character, ArrayList<Integer>>> mapList = new ArrayList<>();
        //Loop through each word
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, ArrayList<Integer>> myMap = new HashMap<>();
            //Loop through each character in each word
            for (int j = 0; j < words[i].length(); j++) {
                //update all characters found
                if(!myMap.containsKey(words[i].charAt(j))) {
                    //Create arraylist to store indexes
                    ArrayList<Integer> indexList = new ArrayList<>();
                    indexList.add(j);
                    myMap.put(words[i].charAt(j), indexList);
                }
                else {
                    //Copy arraylist with indexes, add new index
                    ArrayList<Integer> indexList = myMap.get(words[i].charAt(j));
                    indexList.add(j);
                    myMap.put(words[i].charAt(j), indexList);
                }
            }
            mapList.add(myMap);
        }
        //Loop through all maps and check for containsValue in every map
        int success = 0;
        for (int i = 0; i < mapList.size(); i++) {
            for (int j = 0; j < mapList.size(); j++) {
                if(i == j) {
                    continue;
                }
                else if(compareMaps(mapList.get(i), mapList.get(j))) {
                    success += 1;
                }
            }
        }
        return success / 2;
    }
}
