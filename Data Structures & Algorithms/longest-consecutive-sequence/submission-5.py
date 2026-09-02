class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        sett = set()
        ans=0

        for ele in nums:
            sett.add(ele)

        for ele in nums:
            if ele-1 not in sett:
                num=ele
                count=0
                while num in sett:
                    num+=1
                    count+=1
                ans=max(ans,count)
        return ans


        