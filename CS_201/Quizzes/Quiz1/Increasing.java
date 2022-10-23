import java.util.ArrayList;
public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > list.get(list.size() - 1)) {
                list.add(numbers[i]);
            }
        }
        int size = list.size();
        int[] returnArray = new int[size];
        for (int i = 0; i < size; i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }
}