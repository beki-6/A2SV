class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        N = len(cardPoints)
        M = N-k
        mn = s = sum(cardPoints[:M]) 
        for i in range(k):
            s -= cardPoints[i]
            s += cardPoints[i+M]
            mn = min(mn, s)
        return sum(cardPoints) - mn