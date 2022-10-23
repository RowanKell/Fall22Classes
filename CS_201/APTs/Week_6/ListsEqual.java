public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        if(a1 == null && a2 != null) {
            return 0;
        }
        if(a1 != null && a2 == null) {
            return 0;
        }
        while(a1 != null) {
            if(a2 == null) {
                return 0;
            }
            if(a1.info == a2.info) {
                a1 = a1.next;
                a2 = a2.next;
                continue;
            }
            return 0;
        }
        if(a2 != null) {
            return 0;
        }
        return 1;
    }
}
