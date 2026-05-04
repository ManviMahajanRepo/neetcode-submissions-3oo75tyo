class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>(); // stores indices
        int resultIndex = 0;

        for (int r = 0; r < nums.length; r++) {

            // remove front if it is outside the window
            if (!deque.isEmpty() && deque.peekFirst() <= r - k) {
                deque.pollFirst();
            }

            // remove from back all elements smaller than current
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                deque.pollLast();
            }

            deque.addLast(r);

            // window is fully formed, record the maximum
            if (r >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
