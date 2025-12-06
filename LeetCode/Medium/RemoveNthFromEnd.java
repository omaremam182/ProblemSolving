package medium;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Step 1: Find the length of the list
        ListNode cpy = head;
        int len = 0;
        while (cpy != null) {
            cpy = cpy.next;
            len++;
        }

        // Step 2: If we need to remove the first node
        if (n == len) {
            return head.next; // Removing the head node itself
        }

        int removeElement = len - n;
        cpy = head;
        for (int i = 0; i < removeElement - 1; i++) {
            cpy = cpy.next;
        }

        // Step 4: Remove the nth node from the end
        cpy.next = cpy.next.next;

        return head;
    
    }
    static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
    	 

}
