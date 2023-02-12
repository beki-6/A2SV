class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        l, r, sum, count, n = 0, 0, 0, 0, len(arr)
        while r < n:
            sum += arr[r]
            if r-l+1 >= k:
                if sum/k >= threshold:
                    count += 1
                sum -= arr[l]
                l += 1
            r += 1
        return count