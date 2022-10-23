import java.util.*;
public class PairDownDebug {
    public static void main(String[] args) {
        PairDownDebug p = new PairDownDebug();
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 1; i < 6; i++) {
            newList.add(i);
        }
        int[] array = {1,2,3,4,5};
        p.fold(array);
    }
    public int[] fold(int[] list) {
        //create array of either half the list length if list.length is even, half+1 otherwise
        int[] returnList = list.length % 2 == 0 ? new int[list.length / 2] : new int[list.length / 2 + 1];
//        int[] returnList = new int[list.length / 2];
        System.out.printf("list: %d; return: %d", list.length, returnList.length);
        for(int i = 0;  i < returnList.length; i++) {
            if(i == returnList.length - 1) {
                returnList[i] = list[2 * i];
                break;
            }
            returnList[i] = list[2 * i] + list[2 * i + 1];
        }
        return returnList;
    }
}
