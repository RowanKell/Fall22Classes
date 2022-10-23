import java.util.*;
public class PairDown {
    public int[] fold(int[] list) {
        int[] returnList = list.length % 2 == 0 ? new int[list.length / 2] : new int[list.length / 2 + 1];
        for(int i = 0;  i < returnList.length; i++) {
            if(i == returnList.length - 1 && list.length % 2 != 0) {
                returnList[i] = list[2 * i];
                break;
            }
            returnList[i] = list[2 * i] + list[2 * i + 1];
        }
        return returnList;
    }
}
