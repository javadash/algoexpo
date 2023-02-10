import java.util.HashMap;
import java.util.Map;

// using map
// Time complexity: O(n)
// Space complexity: O(n)


class SolutionB {

    public int[] twoNumberSum (int[] arr, int targetSum) {
        Map<Integer, Boolean> numtable = new HashMap<>();
        for(int j = 0; j < arr.length; j++) {
            int diff = targetSum = arr[j];
            if (numtable.containsKey(diff)) {
                return new int[] {diff, arr[j]}
            } else {
                numtable.put(arr[j], true);
            }
        }
        return new int[] {};
    }
}