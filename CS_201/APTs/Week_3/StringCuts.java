import java.util.ArrayList;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> noDups = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if(!noDups.contains(list[i])) {
                noDups.add(list[i]);
                if(list[i].length() >= minLength) {
                    finalList.add(list[i]);
                }
            }
        }
        String finalArray[] = new String[finalList.size()];
        for (int i = 0; i < finalList.size(); i++) {
            finalArray[i] = finalList.get(i);
        }
        return finalArray;
    }
}
