import java.util.ArrayList;
import java.util.HashMap;
public class Encryption {
    public String encrypt(String message) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
        , 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Character> myMap = new HashMap<>();
        int k = 0;
        for (int i = 0; i < message.length(); i++) {
            if(!myMap.containsKey(message.charAt(i))) {
                myMap.put(message.charAt(i), alphabet[k]);
                k++;
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            output.append(myMap.get(message.charAt(i)));
        }
//        System.out.println(myMap);
        return output.toString();
    }
/*     public static void main(String[] args) {
        Encryption myEncrypt = new Encryption();
        System.out.println(myEncrypt.encrypt("hello"));
    }*/
}
