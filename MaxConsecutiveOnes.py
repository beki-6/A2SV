class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        left,right,count = 0,0,0 
        for right in range(len(nums)):
            if nums[right] == 0:
                count += 1
            if count > k:
                if nums[left] == 0:
                    count -= 1
                left += 1
        return right-left+1