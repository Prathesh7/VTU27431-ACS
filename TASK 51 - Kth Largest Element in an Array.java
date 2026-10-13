class Solution {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            // Keep only k largest elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2

Input:
nums = [3, 2, 1, 5, 6, 4]
k = 2

Output:
5

Expected:
5
