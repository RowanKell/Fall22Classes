import java.util.HashMap;

public class Totality3 {
    public int sum(int[] a, String stype) {
        HashMap<String, Integer> stypeMap = new HashMap<String, Integer>();
        stypeMap.put("odd", 1);
        stypeMap.put("even", 0);
        int returnCount = 0;

        if(stype == "odd" || stype == "even") {
            for(int i = 0; i < a.length; i++) {
                if(i % 2 == stypeMap.get(stype)) {
                    returnCount += a[i];
                }
            }
        }
        else if(stype == "all") {
            for(int i = 0; i < a.length; i++) {
                returnCount += a[i];
            }
        }
        return returnCount;
    }
}