class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        l, r, count, maximum, n = 0, 0, 0, 0, len(s)
        vowels = ['a','e','i','o','u']
        while r < n:
            if s[r] in vowels:
                count += 1
            if r-l+1 >= k:
                maximum = max(maximum, count)
                if s[l] in vowels:
                    count -= 1
                l += 1
            r += 1
        return maximum