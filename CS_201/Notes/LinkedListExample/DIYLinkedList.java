package LinkedListExample;
public class DIYLinkedList {
    public ListNode first;
    public ListNode last;
    public int size;
    public DIYLinkedList() {
        size = 0;
    }
    public void add(String toAdd) {
        if(last == null) {
            last = new ListNode(toAdd);
            first = last;
        }
        else  {
            last.next = new ListNode(toAdd);
            last = last.next;
        }
        size++;
    }
    public String get(int index) {
        ListNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.info;
    }
    public boolean contains(String lookfor) {
        ListNode current = first;
        while(current != null) {

        }
        return true;
    }
    public int size() {
        return size;
    }
}
