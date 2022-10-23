public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        if(list ==  null) {
            return null;
        }
         ListNode first = list;
         ListNode prev = first;
         ListNode current = first.next;
         while(current != null){
             if (current.info != prev.info){
                prev.next = current;
                prev = current;
             }
             current = current.next;
         }
         return first;
    }
     public static void main(String[] args){
        SortedListRemoval test = new SortedListRemoval();
         // TODO - Create your test input
         // Assumes ListNode class defined privately in same
         // file or in another file in same directory.
         ListNode testInput = new ListNode(0, ListNode(1, ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3, ListNode(5))))))));
         // Next line runs test and prints output
         // Assumes a static printList method in a ListNodeUtil class
         // as in previous discussion, can change the line as needed.
         ListNodeUtil.printList(test.uniqify(testInput));
    }
}
