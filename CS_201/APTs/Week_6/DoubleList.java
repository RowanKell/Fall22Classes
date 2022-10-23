public class DoubleList {
    public ListNode bigify(ListNode list) {
        if(list == null) {
            return null;
        }
        ListNode r = new ListNode(list.info);
        ListNode first = r;
        while(list != null) {
            if(list.next == null) {
                r.info = list.info;
                r.next = new ListNode(list.info);
                break;
            }
            r.info = list.info;
            r.next = new ListNode(list.info);
            r.next.next = new ListNode(0);
            r = r.next.next;
            list = list.next;
        }
        return first;
    }
}
