class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        #number of characters 
        #in each string is equal then they are equal
        counts = [0] * 26
        countt = [0] * 26

        for c1 in s:
            counts[ord(c1) - ord('a')] +=1
        for c2 in t:
            countt[ord(c2) - ord('a')] += 1

        if counts == countt:
            return True
        return False

        



        