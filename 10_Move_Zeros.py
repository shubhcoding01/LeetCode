class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        pos = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                nums[pos] = nums[i]
                pos += 1

        for i in range(pos, len(nums)):
            nums[i] = 0
        
# 🔍 Dry Run (Important)
# Input
# nums = [0,1,0,3,12]

# Process
# pos = 0
# i=0 → 0 → skip
# i=1 → 1 → nums[0]=1 → pos=1
# i=2 → 0 → skip
# i=3 → 3 → nums[1]=3 → pos=2
# i=4 → 12 → nums[2]=12 → pos=3


# Array now:

# [1,3,12,?,?]


# Fill zeroes:

# [1,3,12,0,0]