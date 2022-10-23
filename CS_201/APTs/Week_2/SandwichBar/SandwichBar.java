import java.util.HashSet;
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        HashSet<String> availableSet = new HashSet<>();
        for (int i = 0; i < available.length; i++) {
            availableSet.add(available[i]);
        }
        String[] orderArray;
        boolean orderFound = false;
        for (int j = 0; j < orders.length; j++) {
            orderArray = orders[j].split(" ", 0);
            for (int i = 0; i < orderArray.length; i++) {
            }
            for (int i = 0; i < orderArray.length; i++) {
                if (!availableSet.contains(orderArray[i])) {
                    orderFound = false;
                    break;
                }
                orderFound = true;
            }
            if(orderFound) {
                return j;
            }
        }
        
        return -1; 
    }
}