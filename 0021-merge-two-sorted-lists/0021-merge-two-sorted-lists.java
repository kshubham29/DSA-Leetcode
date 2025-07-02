class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }

    
    public static ListNode deserialize(String data) {
        if (data == null || data.equals("[]")) return null;

        data = data.replace("[", "").replace("]", "");
        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part.trim()));
            current = current.next;
        }

        return dummy.next;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
