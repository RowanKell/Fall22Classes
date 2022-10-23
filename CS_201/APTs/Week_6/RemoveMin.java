public class RemoveMin {
    public ListNode remove(ListNode list) {
		if(list == null || list.next == null) {
			return null;
		}
		ListNode checkCopy = list;
        int min = list.info;
        while(checkCopy.next != null) {
			checkCopy = checkCopy.next;
			if(checkCopy.info < min) {
				min  = checkCopy.info;
			}
        }
		if(list.info == min) {
			return list.next;
		}
		ListNode returnCopy = list;
		ListNode first = returnCopy;
		while(list.next != null) {
			list = list.next;
			if(list.info != min) {
				returnCopy.next = list;
				returnCopy = returnCopy.next;
			}
		}
        return first;
    }
 /* 
    public static void main(String[] args) {
        int[] testNums = {10, 5};
        ListNode testList = new ListNode(10, ListNode(5));
        RemoveMin testInstance = new RemoveMin();
        ListNode testResult = testInstance.remove(testList);
        ListNodeUtil.printList(testResult);
    }*/
}