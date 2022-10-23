//Done and turned in
public class ListSum {
    public int sum(ListNode list, int thresh) {
        if(list == null) {
            return 0;
        }
        int r = 0;
        while(list != null) {
            if(list.info > thresh) {
                r += list.info;
            }
            list = list.next;
        }
    return r;
    }
}
