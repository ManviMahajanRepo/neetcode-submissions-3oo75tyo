class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        duplicate = set()
        l = 0
        res = 0

        for r in range(len(s)):
            while s[r] in duplicate:
                duplicate.remove(s[l])
                l += 1
            duplicate.add(s[r])
            res = max(res,r-l+1)
        return res
        