import java.util.*;
public class LunchPlans {
    public String[] favorites(String[] preferences) {
        ArrayList<String[]> fullList = new ArrayList<>();
        for(int i = 0; i < preferences.length; i++) {
            String[] tempList = preferences[i].split(" ");
            fullList.add(tempList);
        }
        ArrayList<ArrayList<String>> listList = new ArrayList<>();
        for(int i = 0; i < fullList.size(); i++) {
            for(int j = 0; j < fullList.get(i).length; j++) {
                listList.add(new ArrayList<String>());
                listList.get(i).add(fullList.get(i)[j]);
            }
        }
        //System.out.println("First List: "+ listList.get(0) + '\n');
        for(int i = 1; i < listList.size(); i++) {
            //System.out.printf("Current List #" + i + ": "+ listList.get(i) + "\n");
            if(listList.get(i).size() > 0) {
                listList.get(0).retainAll(listList.get(i));
            }
        }
        //Now fullList should have arrays of strings for each persons preferences
        String[] returnArray = new String[listList.get(0).size()];
        for(int i = 0; i < returnArray.length; i++) {
            returnArray[i] = listList.get(0).get(i);
        }
        return returnArray;
    }
    
    public static void main(String[] args) {
        String[] test = {"pizza ramen sushi", "sushi ramen spaghetti", "ramen ice-cream sushi"};
        LunchPlans lp = new LunchPlans();
        lp.favorites(test);
    }
}