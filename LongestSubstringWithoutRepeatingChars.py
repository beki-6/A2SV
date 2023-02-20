def lengthOfLongestSubstring(self, s: str) -> int:
    chars = set()
    L, N = 0, len(s)
    ans = 0
    for R in range(N):
        while s[R] in chars:
            chars.remove(s[L])
            L += 1    
        if s[R] not in chars:
            chars.add(s[R])
            ans = max(ans, R - L + 1)
    return ans
