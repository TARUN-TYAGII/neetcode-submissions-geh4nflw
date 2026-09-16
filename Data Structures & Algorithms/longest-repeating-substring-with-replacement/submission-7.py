class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        res=0
        sett = set(s)

        for ch in sett:
            count=l=0
            for r in range(len(s)):
                if s[r]==ch:
                    count+=1
                
                while (r-l+1)-count > k:
                    if s[l] == ch:
                        count-=1
                    l +=1
                res = max(res, r-l+1)
        return res

        