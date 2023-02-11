class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        l = 0
        list = []
        p = sorted(p)
        for i in range(len(p)-1, len(s)):
            if(sorted(s[l:i+1]) == p):
                list.append(l)
            l += 1
        return list