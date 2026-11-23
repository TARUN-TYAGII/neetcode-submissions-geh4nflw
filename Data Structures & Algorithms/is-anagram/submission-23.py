from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        n=len(s)
        m=len(t)
        if m != n:
            return False
        ans=[0]*26
        for i in range(len(s)):
            ans[ord(s[i])-ord('a')]+=1
            ans[ord(t[i])-ord('a')]-=1
        
        for i in range(26):
            if ans[i]!=0:
                return False
        return True


        
        