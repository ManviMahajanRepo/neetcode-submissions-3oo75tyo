class Solution:
    def countSubstrings(self, s: str) -> int:
        #same as before

        count = 0
        resIdx = 0
        resLen = 0

        for i in range(len(s)):
            l,r = i,i
            while l >= 0 and r < len(s) and s[l] ==s[r]:
                if (r-l+1) > resLen:
                    #resLen = r - l + 1
                    #resIdx = l
                    count += 1 
                    l -= 1 #why in while loop here and not in previous one?
                    r += 1# there, we need to return just 1 string, here we need the count

            l,r = i,i+1
            while l >= 0 and r < len(s) and s[l] ==s[r]:
                if (r-l+1) > resLen:
                    #resLen = r - l + 1
                   #resIdx = l
                    count += 1
                    l -= 1
                    r += 1

        return count
        