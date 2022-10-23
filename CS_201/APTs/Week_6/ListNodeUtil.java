public class ListNodeUtil {
    public static ListNode listFromArray(int[] values) {
        if (values.length <= 0) {
            return null;
        }
        ListNode list = new ListNode(values[0]);
        ListNode current = list;
        for(int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
    }
    public static void printList (ListNode list) {
        System.out.print("[");
        while (list.next != null) {
            System.out.printf("%d, ", list.info);
            list = list.next
        }
        if(list != null) {
            System.out.printf("%d", list.info);
        }
        System.out.printf("]%n");
    }
}
