import java.util.ArrayList;
import java.util.Arrays;
public class BigWord2 {
    public String most(String[] sentences) {
        ArrayList<String> separatedWords = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            String[] tempArray = sentences[i].split(" ");
            for (int k = 0; k < tempArray.length; k++) {
                separatedWords.add(tempArray[k]);
            }
        }
        ArrayList<String> noDups = new ArrayList<>();
        for (int i = 0; i < separatedWords.size(); i++) {
            if(!noDups.contains(separatedWords.get(i))) {
                noDups.add(separatedWords.get(i));
            }
        }
        for (int i = 0; i < separatedWords.size(); i++) {
            System.out.println("separatedWords at " + i + " is: " + separatedWords.get(i));
        }
        int[] countArray = new int[noDups.size()];
        Arrays.fill(countArray, 0);
        for (int i = 0; i < noDups.size(); i++) {
            System.out.println("noDups at " + i + ": " + noDups.get(i));
            for(int j = 0; j < separatedWords.size(); j++) {
                String separateWord = separatedWords.get(j);
                System.out.println("separatedWords at " + j + ": " + separatedWords.get(j));
                if(noDups.get(i) == separateWord) {
                    countArray[i] += 1;
                    //System.out.println("Found same: noDups: " + noDups.get(i) + ", and separatedWords: " + separatedWords.get(j));
                }
            }   
        }
        int max = -10;
        int maxIndex = -10;
        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i] > max) {
                max = countArray[i];
                maxIndex = i;
            }
        }
        String returnWord = noDups.get(maxIndex);
        return returnWord.toLowerCase();
    }
    public static void main(String[] args) {
        BigWord2 myWord = new BigWord2();
        String[] myArray = {"big bad dog", "big bad toy", "big bad cat", "small bad cat"};
        String myString = myWord.most(myArray);
        System.out.println("Output: " + myString);
    }
}