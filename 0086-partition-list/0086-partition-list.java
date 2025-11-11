class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0), big = new ListNode(0);
        ListNode p1 = small, p2 = big;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = big.next;
        return small.next;
    }
}
