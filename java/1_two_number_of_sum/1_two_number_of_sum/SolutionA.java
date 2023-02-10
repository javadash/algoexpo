// Two for loops
// Time complexity: O(n^2)
// Space complexity: O(1)


class SolutionA {

    public int[] twoNumberSum (int[] arr, int targetSum) {
        for(int i = 0; i < arr.length - 1; i++) {
            int firstNum = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                int secondNum = arr[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
    }
}