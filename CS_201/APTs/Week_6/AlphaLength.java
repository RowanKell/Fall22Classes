import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class AlphaLength {
    public ListNode create (String[] words) {
        Arrays.sort(words);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(!list.contains(words[i])) {
                list.add(words[i]);
            }
        }
        ListNode first = new ListNode(list.get(0).length());
        ListNode copy = first;
        for (int i = 1; i < list.size(); i++) {
            copy.next = new ListNode(list.get(i).length());
            copy = copy.next;
        }
    return first;
    }
}