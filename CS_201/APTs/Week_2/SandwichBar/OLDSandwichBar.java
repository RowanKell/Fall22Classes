import java.util.ArrayList;

public class OLDSandwichBar {
    public boolean isSame(String[] options, String pick) {
        boolean output = false;
        pick = pick.replaceAll("\\s", "");
        for(int i = 0; i < options.length; i++) {
            if(options[i].equals(pick)) {
                output = true;
                break;
            }
        }
        return output;
    }
    public int whichOrder(String[] available, String[] orders){
        String ingredient;
        ArrayList<String> orderIngredients = new ArrayList<String>();
        ArrayList<Integer> spaceArray = new ArrayList<Integer>();
        spaceArray.add(0);
        int foundOrder = -1;
        for(int i = 0; i < orders.length; i++) {
            orderIngredients.clear();
            spaceArray.clear();
            for(int j = 0; j < orders[i].length(); j++) {
                if(orders[i].charAt(j) == ' ') {
                    spaceArray.add(j);
                }
            }
            for(int j = 0; j < spaceArray.size(); j++) {
                if(j == spaceArray.size() - 1) {
                    orderIngredients.add(orders[i].substring(spaceArray.get(j), orders[i].length()));
                }
                else {
                    orderIngredients.add(orders[i]
                    .substring(spaceArray.get(j),spaceArray.get(j+1) + 1));
                }
            }
            String[] otherArray;
            otherArray = new String [orderIngredients.size()];
            for(int j = 0; j < orderIngredients.size(); j++) {
                otherArray[j] = orderIngredients.get(j);
            }
            for(int j = 0; j < orderIngredients.size(); j++) {
                if(!isSame(available, otherArray[j])) {
                    break;
                }
                if(j == orderIngredients.size() - 1) {
                    foundOrder = i;
                }
            }
        }
        return foundOrder;
    }
 }
