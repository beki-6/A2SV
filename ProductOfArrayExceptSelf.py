class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix, postfix = 1, 1
        n = len(nums)
        answer = [1] * n
        for i in range(n):
            answer[i] = prefix
            prefix *= nums[i]
        for i in range(n-1, -1, -1):
            answer[i] *= postfix
            postfix *= nums[i]
        return answer