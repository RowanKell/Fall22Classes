import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.HashSet;

public class MemberCheck {
/*      public String[] sortDictionary(String[] myArray) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'}
        HashMap<Character, Integer> alphaMap = new HashMap<Character, Integer>();
        for (int i = 0; i < alphabet.length; i++) {
            alphaMap.put(alphabet[i], i);
        }
        for (int i = 0; i < myArray.length; i++) {

        }
        String[] newArray = new String[0];
        return newArray;
    }*/
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        HashSet<String> club1Set = new HashSet<>();
        HashSet<String> club2Set = new HashSet<>();
        HashSet<String> club3Set = new HashSet<>();
        for (int i = 0; i < club1.length; i++) {
            club1Set.add(club1[i]);
        }
        for (int i =  0; i < club2.length; i++) {
            club2Set.add(club2[i]);
        }
        for (int i =  0; i < club3.length; i++) {
            club3Set.add(club3[i]);
        }
        HashSet<String> club1Copy = new HashSet<>(club1Set);
        HashSet<String> club2Copy = new HashSet<>(club2Set);
        club1Set.retainAll(club2Set); //This checks for same people between 1 and 2
        club1Copy.retainAll(club3Set); // Checks between 1 and 3
        club2Copy.retainAll(club3Set); // Checks between 2 and 3
        //Now need to get all names that are in any of these three
        club1Set.addAll(club1Copy);
        club1Set.addAll(club2Copy);
        ArrayList<String> returnString = new ArrayList<String>();
        String[] sortedReturn = new String[club1Set.size()];
        for (String name : club1Set) {
            returnString.add(name);
        }
        Collections.sort(returnString);
        for (int i = 0; i < returnString.size(); i++) {
            sortedReturn[i] = returnString.get(i);
        }
        return sortedReturn;
    }
/*     public static void main(String[] args) {
        MemberCheck myMember = new MemberCheck();
        String[] club11 = {"JOHN","JOHN","FRED","PEG"};
        String[] club21 = {"GEORGE","DAVID"};
        String[] club31 = {"GEORGE","PEG"};
        String[] output = myMember.whosDishonst(club11, club21, club31);
        for (String out : output) {
            System.out.println(out);
        }
    }*/
}
