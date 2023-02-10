

// using map
// Time complexity: O(nlogn)
// Space complexity: O(1)

class SolutionC {
    public int[] twoNumberSum (int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) {
                return new int[] {arr[left], arr[right]};
            } else if(currentSum < targetSum) {
                left += 1;
            } else if(currentSum > targetSum) {
                right -= 1;
            }
        }
        return new int[] {};
    }
}