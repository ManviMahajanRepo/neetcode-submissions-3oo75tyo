class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        currRes = 0
        resIdx = 0 # why we track Index? This tracks the index of 
        #left palidrome char. Why store entire strings and waste memory 
        #when we can note down the index and move forward
        # to check further
    #odd
        for i in range(len(s)):
            l,r = i,i # starting from center
            while l >=0 and r < len(s) and s[l] == s[r]:
                if (r - l + 1) > currRes:
                    resIdx = l #note down this first as this is first condition
                    # to satisfy that there could be a palindrome
                    currRes = r - l + 1
                l -= 1
                r += 1
    #even
            l,r = i,i+1
            while l >=0 and r < len(s) and s[l] == s[r]:
                if (r - l + 1) > currRes:
                    resIdx = l
                    currRes = r - l + 1
                l -= 1
                r += 1
        return s[resIdx:resIdx+currRes]

            
        