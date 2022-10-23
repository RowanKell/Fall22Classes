import java.util.*;
public class Aaagmnrs {
   public boolean ana(String one, String two) {
      one = one.toLowerCase();
      two = two.toLowerCase();
      char[] oneArray = one.toCharArray();
      Arrays.sort(oneArray);
      char[] twoArray = two.toCharArray();
      Arrays.sort(twoArray);
      if(!(oneArray.length == twoArray.length)) {
         return false;
      }
      for (int i = 0; i < oneArray.length; i++) {
         if (oneArray[i] != twoArray[i]) {
            return false;
         }
      }
      return true;
   }
   public String[] anagrams(String[] phrases) {
      ArrayList<String> list = new ArrayList<>();
      HashMap<String, String> map = new HashMap<>();
      for (int i = 0; i < phrases.length; i++) {
         String newPhrase = phrases[i].replaceAll("\\s","");
         list.add(newPhrase);
         if(!map.containsKey(newPhrase)) {
            map.put(newPhrase, phrases[i]);
         }
      }
      ArrayList<String> checkedList = new ArrayList<>();
      for (int i = 0; i < list.size(); i++) {
         boolean checked = true;
         for (int j = 0; j < checkedList.size(); j++) {
            if(ana(list.get(i), checkedList.get(j))) {
               checked = false;
            }

         }
         if(checked) {
            checkedList.add(list.get(i));
         }
      }
      String[] returnList = new String[checkedList.size()];
      for (int i = 0; i < checkedList.size(); i++) {
         returnList[i] = map.get(checkedList.get(i));
      }
      return returnList;
    }
 }
