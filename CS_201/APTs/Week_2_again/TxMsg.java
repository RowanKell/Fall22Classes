import java.util.HashSet;
import java.util.ArrayList;
public class TxMsg {
    public boolean isConsonant(char character) {
        HashSet<Character> vowels = new HashSet<>();
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        for (char letter : vowelArray) {
            vowels.add(letter);
        }
        if(character == ' ') {
            return false;
        }
        else if(vowels.contains(character)) {
            return false;
        }
        return true;
    }
    public String getMessage(String original) {
        ArrayList<String> finalWords = new ArrayList<>();
        HashSet<Character> vowels = new HashSet<>();
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        for (char letter : vowelArray) {
            vowels.add(letter);
        }
        String output = "";
        //The splitting works
        String[] originalList = original.split(" ");
        // Loop through all words
        for (int i = 0; i < originalList.length; i++) {
            boolean allVowels = true;
            int consonantCount = 0;
            String word = originalList[i];
            //Loop through all letters
            for (int j = 0; j < originalList[i].length(); j++) {
                char letter = word.charAt(j);
                if(!vowels.contains(letter)) {
                    allVowels = false;
                }
                if(isConsonant(letter)) {
                    consonantCount += 1;
                }
            }
            //Check for words with only vowels - copy these to the finalWords
            if(allVowels) {
                finalWords.add(word);
            }
            String placeHolder = "";
            //Dealing with words that have consonants
            if(consonantCount > 0) {
                if(isConsonant(word.charAt(0))) {
                    placeHolder = placeHolder + word.charAt(0);
                }
                for (int j = 1; j < word.length(); j++) {
                    //Checking for vowels, and not adding them
                    if(vowels.contains(word.charAt(j))) {
                        continue;
                    }
                    //Checking if the letter before the current letter is a consonant - if so, don't add
                    if (isConsonant(word.charAt(j - 1))) {
                        continue;
                    }
                    placeHolder = placeHolder + word.charAt(j);
                }
                finalWords.add(placeHolder);
            }
        }
        for (int i = 0; i < finalWords.size(); i++) {
            if(i == finalWords.size() - 1) {
                output = output + finalWords.get(i);
            }
            else {
                output = output + finalWords.get(i) + " ";
            }
        }
        return output;
    }
}
