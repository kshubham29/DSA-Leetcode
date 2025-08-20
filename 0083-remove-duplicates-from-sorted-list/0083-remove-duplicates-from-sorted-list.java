class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode deserialize(String data) {
        if (data == null || data.length() <= 2) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String val : vals) {
            current.next = new ListNode(Integer.parseInt(val.trim()));
            current = current.next;
        }
        return dummy.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) sb.append(",");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = ListNode.deserialize("[1,1,2]");
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);
        System.out.println(result);
    }
}
