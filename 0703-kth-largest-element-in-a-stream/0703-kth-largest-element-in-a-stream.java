import java.util.PriorityQueue;

class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        // Add initial elements
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);

        // Keep only k largest elements
        if (minHeap.size() > k) {
            minHeap.poll();
        }

        // Root of heap is kth largest
        return minHeap.peek();
    }
}
