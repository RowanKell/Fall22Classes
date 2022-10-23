public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] splitArray = str.split(" ");
        int[] countArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String element = words[i];
            countArray[i] = 0;
            for (int j = 0; j < splitArray.length; j++) {
                if (element.equals(splitArray[j])) {
                    countArray[i] += 1;
                }
            }
        }
        return countArray;
    }
}