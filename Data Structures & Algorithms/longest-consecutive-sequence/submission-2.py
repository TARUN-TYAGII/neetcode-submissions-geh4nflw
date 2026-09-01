class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # first put in set
        # then run while and check 
        seen = set()
        ans=0
        for ele in nums:
            seen.add(ele)
        
        for ele in nums:
            if ele-1 not in seen:
                start=ele
                count=0
                while start in seen:
                    start+=1
                    count+=1
                
                ans= max(ans, count)
        return ans

        