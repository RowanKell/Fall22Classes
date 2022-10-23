import java.util.HashSet;
public class TxMsgOLD {
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
        HashSet<Character> vowels = new HashSet<>();
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        for (char letter : vowelArray) {
            vowels.add(letter);
        }
        String output = "";
        String charConvert;
        char previousLetter = ' ';
        for (int i = 0; i < original.length(); i++) {
            if(isConsonant(previousLetter)) {
                if(isConsonant(original.charAt(i))) {
                    previousLetter = original.charAt(i);
                    continue;
                }
            }
            // This looks for vowels that are not after spaces
            if(!(previousLetter == ' ')) {
                if(vowels.contains(original.charAt(i))) {
                    previousLetter = original.charAt(i);
                    continue;
                }
            }
            charConvert = String.valueOf(original.charAt(i));
            output = output + charConvert;
            previousLetter = original.charAt(i);

        }
        return output;
    }
}
