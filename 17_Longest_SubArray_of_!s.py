class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        maxLen = 0
        zeroCount = 0
        left = 0

        for right in range(len(nums)):
            if nums[right] == 0:
                zeroCount += 1

            while zeroCount > 1:
                if nums[left] == 0:
                    zeroCount -= 1
                left +=1

            maxLen = max(maxLen , right - left)

        return maxLen