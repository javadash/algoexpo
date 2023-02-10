
## using map
## Time complexity: O(n)
## Space complexity: O(n)

def twoNumberSum(array, targetSum):
    nums = dict()

    for num in array:
        potentialMatch = targetSum - num 
        if (potentialMatch in nums):
            return [potentialMatch, num]
        else:
            nums[num] = True
    return []
