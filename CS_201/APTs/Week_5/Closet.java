import java.util.*;
import java.util.ArrayList;
public class Closet {
/*
    public static void main(String[] args) {
        String[] test = {"a b c d", "b c d", "b c d e", "b c f" };
        SetAside s = new SetAside();
        s.common(test);
    }
*/
    public String anywhere(String[] list) {
        ArrayList<TreeSet<String>> SetList = new ArrayList<TreeSet<String>>();
        for (int i = 0; i < list.length; i++) {
            String[] stringArray = list[i].split(" ");
            TreeSet<String> set = new TreeSet<>();
            for (int j = 0; j < stringArray.length; j++) {
                set.add(stringArray[j]);
            }
            SetList.add(set);

        }
        for (int i = 1; i < SetList.size(); i++) {
            SetList.get(0).addAll(SetList.get(i));
        }
        return String.join(" ", SetList.get(0));
    }
}