public class Totality {
    public int sum(int[] a, String stype) {
        int returnCount = 0;

        if(stype.equals("odd")) {
            for(int i = 0; i < a.length; i++) {
                if(i % 2 == 1) {
                    returnCount += a[i];
                }
            }
        }
        else if(stype.equals("even")) {
            for(int i = 0; i < a.length; i++) {
                if(i % 2 == 0) {
                    returnCount += a[i];
                }
            }
        }
        else if(stype.equals("all")) {
            for(int i = 0; i < a.length; i++) {
                returnCount += a[i];
            }
        }
        return returnCount;
    }
}